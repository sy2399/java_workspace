package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
	public void go() throws IOException{
		ServerSocket serverSocket=null;
		try{
			serverSocket=new ServerSocket(5432);
			System.out.println("**step2 서버실행**");
			while(true){					
				Socket socket=serverSocket.accept();
				String ip=socket.getInetAddress().toString();				
				BufferedReader br
				=new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				String message=br.readLine();				
				System.out.println(ip+"님의 메세지:"+message);
				br.close();
				socket.close();			
				
			}
		}finally{
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new Server2().go();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
