package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestOutput {
	public static void main(String[] args) {
		try {
			//���Ͽ� ����Ǵ� ��彺Ʈ��: ������ ������ �������ش� 
			//�ι�° ���ڰ����� true �� append �����̱� 
			FileWriter fw
			=new FileWriter("C:\\java-kosta\\test\\memo.txt",true);
			//���ڿ� ����ϱ� ���� ���μ��� ��Ʈ�� 
			PrintWriter pw=new PrintWriter(fw);
			pw.println("�氡�氡 IO");
			pw.close();
			System.out.println("�۾��Ϸ�");
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}






