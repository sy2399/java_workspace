package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import review.CommonInfo;

public class Client1 {
	public void go() throws UnknownHostException, IOException{
		//								server ip  , port 
		//Socket socket=new Socket("127.0.0.1",5432);
		Socket socket=new Socket(CommonInfo.INST_IP,5432);
		System.out.println("**클라이언트가 서버에 접속**");
		BufferedReader br=new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		System.out.println("서버가 보낸 메세지:"+br.readLine());
		br.close();
		socket.close();
		System.out.println("**클라이언트 종료**");
	}
	public static void main(String[] args) {
		try {
			new Client1().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



