package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import review.CommonInfo;

public class Client2 {
	public void go() throws IOException{
		Socket socket=null;
		BufferedReader consoleBr=null;
		PrintWriter pw=null;
		try{
			socket=new Socket(CommonInfo.LOCAL_IP,5432);
			System.out.println("***client가 서버에 접속***");
			consoleBr=new BufferedReader(new InputStreamReader(System.in));
			pw=new PrintWriter(socket.getOutputStream(),true);
			System.out.print("전송할 메세지를 입력하세요 :");
			pw.println(consoleBr.readLine());
			System.out.println("***client 접속 종료***	");
		}finally{
			if(consoleBr!=null)
				consoleBr.close();			
			if(pw!=null)
				pw.close();
			if(socket!=null)
				socket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new Client2().go();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
