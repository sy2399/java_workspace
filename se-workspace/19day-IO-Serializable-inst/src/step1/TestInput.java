package step1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestInput {
	public static void main(String[] args) {
		//1byte ���� �Է½�Ʈ�� 
		try {
			FileInputStream fis
			=new FileInputStream("C:\\java-kosta\\test\\output.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			//bis.read(); // int ������ ��ȯ , �� ���� ������ ������ -1�� ��ȯ 
			int data=-1;
			while((data=bis.read())!=-1){
				System.out.println((char)data);
			}
			bis.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}





