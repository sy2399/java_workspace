package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*	MultiServer : 다수의 클라이언트에게 Echo 서비스를 제공한다 
 * 					클라이언트 접속 대기하다가 
 * 				    클라이언트가 접속하면 일반소켓을 반환받고 
 * 					실제 클라이언트와 통신할 ServerWorker 스레드를 
 * 					생성해(생성시 일반 소켓을 할당해준다 ) 
 *                  start 시키고 다시 클라이언트와 접속을 대기한다 
 * ServerWorker Thread : MultiServer에 의해 할당받은 일반 소켓으로 
 * 							   실제 클라이언트와 통신한다 (Echo 서비스) 
 * 
 */
public class MultiServer {
	public void go() throws IOException{
		ServerSocket serverSocket=null;
		try{
			serverSocket=new ServerSocket(5432);
			System.out.println("**MultiServer 실행**");
			while(true){
				Socket socket=serverSocket.accept();
				String clientIp=socket.getInetAddress().toString();
				System.out.println("["+clientIp+"] 님 입장");
				// ServerWorker 객체 생성(생성시 Socket 할당) 
				// Thread 를 실행가능상태로 보낸다 
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
						if(message==null||message.equals("null")||message.equals("종료")){
							System.out.println("["+clientIp+"] 나가셨습니다");
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
				System.out.println(clientIp+" 나가셨습니다!");
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


