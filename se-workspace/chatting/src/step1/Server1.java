package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	private int count;
	public void go() throws IOException{
		ServerSocket serverSocket=null;
		try{
		serverSocket=new ServerSocket(5432);
		System.out.println("**서버 가동중**");
		//accept() : 클라이언트 접속시까지 대기하다 접속하면 실행된다
		// 클라이언트 연결 정보를 가지고 있는 일반 소켓 객체를 반환한다
		// 다수의 클라이언트에게 서비스하기 위해 반복문을 이용한다 
		while(true){
		Socket socket=serverSocket.accept();			
		//접속한 클라이언트 IP 정보를 출력한다 
		System.out.println("접속한 클라이언트 IP:"+socket.getInetAddress());
		//서버에서 접속한 클라이언트로 데이터를 출력 
		//true : autoflush
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
		pw.println("방가~~"+count);
		System.out.println("**데이터 출력**"+count++);
		pw.close();
		}//while
		}finally{
		System.out.println("**서버종료**");
		serverSocket.close();
		}
	}
	public static void main(String[] args) {
		Server1 server=new Server1();
		try {
			server.go();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}





