package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server3 {
	public void go() throws IOException{
		ServerSocket serverSocket=null;
		Socket socket=null;
		BufferedReader br=null;
		PrintWriter pw=null;
		try{
			serverSocket=new ServerSocket(5432);
			System.out.println("**EchoServer**");
			socket=serverSocket.accept();
			System.out.println(
					"["+socket.getInetAddress()+"] ����");
			br=new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);
			try{
				while(true){	
					String message=null;			
						message=br.readLine();				
						if(message==null||message.equals("null")||message.equals("����")){
							System.out.println("client ���������Ƿ� server�� ����");
							break;
						}
						System.out.println("client message:"+message);
						pw.println(message+" server~~");			
				}
			}catch(SocketException se){
				System.out.println("client�� ������������");					
			}
		}finally{
			if(pw!=null)
				pw.close();
			if(br!=null)
				br.close();
			if(socket!=null)
				socket.close();
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new Server3().go();
		} catch (IOException e) {		
			e.printStackTrace();
		}
	}
}
