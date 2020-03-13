package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import review.CommonInfo;

public class Client3 {
	public void go() throws IOException{
		Socket socket=null;
		BufferedReader sysBr=null;//콘솔에서 입력받는 스트림
		PrintWriter pw=null;//서버로 출력하는 스트림 
		BufferedReader br=null;//서버 데이터를 입력받는 스트림
		try{
			socket=new Socket(CommonInfo.LOCAL_IP,5432);
			System.out.println("**EchoClient 시작**");
			sysBr=new BufferedReader(new InputStreamReader(System.in));
			pw=new PrintWriter(socket.getOutputStream(),true);
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true){
				System.out.print("메세지:");
				String data=sysBr.readLine();//콘솔에서 입력
				pw.println(data);//서버로 출력
				if(data.equals("종료")){
					System.out.println("**EchoClient 종료**");
					break;
				}
				String serverMessage=br.readLine();//서버에서 입력
				System.out.println(serverMessage);
				
			}
		}finally{
			if(br!=null)
				br.close();
			if(pw!=null)
				pw.close();
			if(sysBr!=null)
				sysBr.close();
			if(socket!=null)
				socket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new Client3().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
