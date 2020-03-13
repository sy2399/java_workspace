package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

/* 
 * ChattingClient는  두 개의 스레드가 필요하다 
 * main thread: 콘솔에서 입력받아 서버로 메세지 출력하는 스레드
 * ClientWorker Thread : 서버에서 전송되는 메세지를 입력받아 
 *         콘솔에 출력하는 스레드 
 */
public class ChattingClient {
	private Socket socket; // 서버와 통신하기 위한 소켓
	private Scanner scanner;// 콘솔에서 입력
	private PrintWriter pw;// 서버로 데이터 출력
	private BufferedReader br;// 서버에서 오는 메세지를 입력 ( ClientWorker Thread에서 사용)
	/*
	 * 소켓생성 스캐너생성 출력스트림생성 ClientWorker Thread 생성 setDaemon(true) 설정하여 main
	 * thread 종료되면 ClientWorker Thread도 종료되게 한다 스레드를 실행가능상태로 만든다 start while
	 * 콘솔에서 입력받아 서버로 출력 작업 ( 종료전까지 반복 )
	 * 
	 */
	public void go() throws UnknownHostException, IOException {
		System.out.println("**ChattingClient**");
		socket=new Socket(IP.MY_IP,5432);
		scanner=new Scanner(System.in);
		pw=new PrintWriter(socket.getOutputStream(),true);
		Thread t=new Thread(new ClientWorker());
		//ChattingClient main thread 종료되면 함께 종료되도록 설정 
		t.setDaemon(true);
		t.start();
		while(true){
			String message=scanner.nextLine();
			pw.println(message);
			if(message.equals("종료"))
				break;
		}
	}
	/*
	 * 서버에서 오는 메세지를 입력받는 스레드
	 */
	class ClientWorker implements Runnable {
		/*
		 * 입력스트림 생성 while 서버에서 오는 메세지를 입력받아 null이 아니면 콘솔에 출력한다
		 * 
		 * finally 블럭에서 입출력에 사용된 모든 스트림과 소켓을 닫아준다
		 */
		@Override
		public void run() {
			try {
				br=new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				while(true){
					String message=br.readLine();
					if(message==null)
						break;
					System.out.println(message);
				}
			} catch (IOException e) {			
				e.printStackTrace();
			}finally {
				try {
					closeAll();
				} catch (IOException e) {					
					e.printStackTrace();
				}
			}
		}
	}

	public void closeAll() throws IOException {
		if(scanner!=null)
			scanner.close();
		if(pw!=null)
			pw.close();
		if(br!=null)
			br.close();
		if(socket!=null)
			socket.close();
	}

	public static void main(String[] args) {
		try {
			new ChattingClient().go();
		} catch (IOException e) {		
			e.printStackTrace();
		}
	}
}







