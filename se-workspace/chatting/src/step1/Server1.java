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
		System.out.println("**���� ������**");
		//accept() : Ŭ���̾�Ʈ ���ӽñ��� ����ϴ� �����ϸ� ����ȴ�
		// Ŭ���̾�Ʈ ���� ������ ������ �ִ� �Ϲ� ���� ��ü�� ��ȯ�Ѵ�
		// �ټ��� Ŭ���̾�Ʈ���� �����ϱ� ���� �ݺ����� �̿��Ѵ� 
		while(true){
		Socket socket=serverSocket.accept();			
		//������ Ŭ���̾�Ʈ IP ������ ����Ѵ� 
		System.out.println("������ Ŭ���̾�Ʈ IP:"+socket.getInetAddress());
		//�������� ������ Ŭ���̾�Ʈ�� �����͸� ��� 
		//true : autoflush
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
		pw.println("�氡~~"+count);
		System.out.println("**������ ���**"+count++);
		pw.close();
		}//while
		}finally{
		System.out.println("**��������**");
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





