package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*	MultiServer : �ټ��� Ŭ���̾�Ʈ���� Echo ���񽺸� �����Ѵ� 
 * 					Ŭ���̾�Ʈ ���� ����ϴٰ� 
 * 				    Ŭ���̾�Ʈ�� �����ϸ� �Ϲݼ����� ��ȯ�ް� 
 * 					���� Ŭ���̾�Ʈ�� ����� ServerWorker �����带 
 * 					������(������ �Ϲ� ������ �Ҵ����ش� ) 
 *                  start ��Ű�� �ٽ� Ŭ���̾�Ʈ�� ������ ����Ѵ� 
 * ServerWorker Thread : MultiServer�� ���� �Ҵ���� �Ϲ� �������� 
 * 							   ���� Ŭ���̾�Ʈ�� ����Ѵ� (Echo ����) 
 * 
 */
public class MultiServer {
	public void go() throws IOException{
		ServerSocket serverSocket=null;
		try{
			serverSocket=new ServerSocket(5432);
			System.out.println("**MultiServer ����**");
			while(true){
				Socket socket=serverSocket.accept();
				String clientIp=socket.getInetAddress().toString();
				System.out.println("["+clientIp+"] �� ����");
				// ServerWorker ��ü ����(������ Socket �Ҵ�) 
				// Thread �� ���డ�ɻ��·� ������ 
				ServerWorker worker=new ServerWorker(socket);
				Thread thread=new Thread(worker);
				thread.start();
			}
		}finally{
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	class ServerWorker implements Runnable{
		private Socket socket;
		private BufferedReader br;
		private PrintWriter pw;
		private String clientIp;
		public ServerWorker(Socket socket){
			this.socket=socket;
			clientIp=socket.getInetAddress().toString();
		}
		public void echo() throws IOException{
			try{
					br=new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
					pw=new PrintWriter(socket.getOutputStream(),true);
					while(true){
						String message=br.readLine();
						if(message==null||message.equals("null")||message.equals("����")){
							System.out.println("["+clientIp+"] �����̽��ϴ�");
							break;
						}
						System.out.println("["+clientIp+"]:"+message);
						pw.println(message+" server^^");
					}
			}finally{
				closeAll();
			}
		}
		public void closeAll() throws IOException{
			if(pw!=null)
				pw.close();
			if(br!=null)
				br.close();			
			if(socket!=null)
				socket.close();							
		}
		@Override
		public void run() {
			try {
				echo();
			} catch (IOException e) {
				System.out.println(clientIp+" �����̽��ϴ�!");
			}
		}		
	}
	public static void main(String[] args) {
		try {
			new MultiServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


