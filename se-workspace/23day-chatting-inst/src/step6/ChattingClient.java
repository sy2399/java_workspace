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
 * ChattingClient��  �� ���� �����尡 �ʿ��ϴ� 
 * main thread: �ֿܼ��� �Է¹޾� ������ �޼��� ����ϴ� ������
 * ClientWorker Thread : �������� ���۵Ǵ� �޼����� �Է¹޾� 
 *         �ֿܼ� ����ϴ� ������ 
 */
public class ChattingClient {
	private Socket socket; // ������ ����ϱ� ���� ����
	private Scanner scanner;// �ֿܼ��� �Է�
	private PrintWriter pw;// ������ ������ ���
	private BufferedReader br;// �������� ���� �޼����� �Է� ( ClientWorker Thread���� ���)
	/*
	 * ���ϻ��� ��ĳ�ʻ��� ��½�Ʈ������ ClientWorker Thread ���� setDaemon(true) �����Ͽ� main
	 * thread ����Ǹ� ClientWorker Thread�� ����ǰ� �Ѵ� �����带 ���డ�ɻ��·� ����� start while
	 * �ֿܼ��� �Է¹޾� ������ ��� �۾� ( ���������� �ݺ� )
	 * 
	 */
	public void go() throws UnknownHostException, IOException {
		System.out.println("**ChattingClient**");
		socket=new Socket(IP.MY_IP,5432);
		scanner=new Scanner(System.in);
		pw=new PrintWriter(socket.getOutputStream(),true);
		Thread t=new Thread(new ClientWorker());
		//ChattingClient main thread ����Ǹ� �Բ� ����ǵ��� ���� 
		t.setDaemon(true);
		t.start();
		while(true){
			String message=scanner.nextLine();
			pw.println(message);
			if(message.equals("����"))
				break;
		}
	}
	/*
	 * �������� ���� �޼����� �Է¹޴� ������
	 */
	class ClientWorker implements Runnable {
		/*
		 * �Է½�Ʈ�� ���� while �������� ���� �޼����� �Է¹޾� null�� �ƴϸ� �ֿܼ� ����Ѵ�
		 * 
		 * finally ������ ����¿� ���� ��� ��Ʈ���� ������ �ݾ��ش�
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







