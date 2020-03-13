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
		BufferedReader sysBr=null;//�ֿܼ��� �Է¹޴� ��Ʈ��
		PrintWriter pw=null;//������ ����ϴ� ��Ʈ�� 
		BufferedReader br=null;//���� �����͸� �Է¹޴� ��Ʈ��
		try{
			socket=new Socket(CommonInfo.LOCAL_IP,5432);
			System.out.println("**EchoClient ����**");
			sysBr=new BufferedReader(new InputStreamReader(System.in));
			pw=new PrintWriter(socket.getOutputStream(),true);
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true){
				System.out.print("�޼���:");
				String data=sysBr.readLine();//�ֿܼ��� �Է�
				pw.println(data);//������ ���
				if(data.equals("����")){
					System.out.println("**EchoClient ����**");
					break;
				}
				String serverMessage=br.readLine();//�������� �Է�
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
