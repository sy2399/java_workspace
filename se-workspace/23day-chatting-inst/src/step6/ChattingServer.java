package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*  채팅 서버 
 *  다수의 클라이언트와 지속적으로 통신 
 *  클라이언트가 보낸 메세지를 입력받아 
 *  접속한 모든 클라이언트에게 메세지를 출력한다 
 */
public class ChattingServer {
	/*
	 * 접속한 클라이언트와 통신할 ServerWorker 객체들을 저장한다 
	 * 접속하면 list에 add 하고 접속해제되면 list에서
	 * remove 한다 
	 * public boolean add(E e) 
	 * public boolean remove(Object o) 
	 */
	/*
	 * ArrayList 는 다수의 ServerWorker Thread에 의해 
	 * 공유되는 자원이다 
	 * thread-safe 하게 만들기 위해 Collections.synchronizedList() 를 
	 * 이용하여 동기화 처리한다 
	 */
	//private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	private List<ServerWorker> list
			=Collections.synchronizedList(new ArrayList<ServerWorker>());
	/*
	 * ChattingServer 의 역할은 ServerSocket 생성 후 
	 * client 접속시 매번 accept를 실행하여
	 * ServerWorker < Thread 생성 후 start 시켜준다
	 * 이 때 생성한 ServerWorker를 list에 add 한다
	 */
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try{
			serverSocket=new ServerSocket(5432);
			System.out.println("**채팅서버**");
			while(true){
				Socket socket=serverSocket.accept();
				ServerWorker serverWorker=new ServerWorker(socket);
				Thread t=new Thread(serverWorker);
				//list에 ServerWorker를 추가 
				list.add(serverWorker);
				t.start();
			}
		}finally{
			if(serverSocket!=null)
			serverSocket.close();
		}
	}

	// 접속한 모든 클라이언트에게 메세지를 전달하는 메서드
	public void broadcast(String message) {
		for(int i=0;i<list.size();i++){
			list.get(i).pw.println(message);
		}
	}

	class ServerWorker implements Runnable {
		private Socket socket;
		private String clientIp;
		private BufferedReader br;// 클라이언트로부터 입력받는 스트림
		private PrintWriter pw;// 클라이언트로 출력하는 스트림
		ServerWorker(Socket socket) {
			this.socket=socket;
			clientIp="["+socket.getInetAddress().toString()+"]";
			System.out.println(clientIp+"님 입장^^");
			broadcast(clientIp+"님 입장^^");
		}
		@Override
		public void run() {
			try {
				chatting();
			} catch (IOException e) {				
				System.out.println(clientIp+ "강제 종료");
			} finally{
				list.remove(this); // 스레드 종료전에 리스트에서 삭제한다 
				System.out.println(clientIp+" 나갔음");
				broadcast(clientIp+" 나갔음");
				try {
					closeAll();
				} catch (IOException e) {					
					e.printStackTrace();
				}
			}
		}// run
		// 접속한 전체 클라이언트에게 입력받은 메세지를 보낸다
		public void chatting() throws IOException {
			br=new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);//true:autoflush
			while(true){
				String message=br.readLine();
				if(message==null||message.equals("null")||message.equals("종료"))
					break;
				broadcast(clientIp+"님: "+message);//입력받은 메세지를 모두에게 출력한다 
			}
		}
		// 사용한 모든 자원을 close 한다
		public void closeAll() throws IOException {
			if(br!=null)
				br.close();
			if(pw!=null)
				pw.close();
			if(socket!=null)
				socket.close();
		}
	}

	public static void main(String[] args) {
		try {
			new ChattingServer().go();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}










