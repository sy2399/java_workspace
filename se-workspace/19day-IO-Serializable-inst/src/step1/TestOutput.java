package step1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
// 1byte ���� ��½�Ʈ���� �̿� 
public class TestOutput {
	public static void main(String[] args) {
		try {
			FileOutputStream fos
				=new FileOutputStream("C:\\java-kosta\\test\\output.txt");
			PrintStream ps=new PrintStream(fos);
			ps.println("������");
			System.out.println("��¿Ϸ�");
			ps.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
	}
}






