package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestOutput2 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\���ɸ޴�.txt";
		try {
		FileWriter fw=new FileWriter(path);
		PrintWriter pw=new PrintWriter(fw,true);//true : autoflush 		
		Scanner s=new Scanner(System.in);
		System.out.println("**���ɸ޴�**");
		while(true){			
			String menu=s.nextLine();
			if(menu.equals("�ֹ���")){
				System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�!");
				break;
			}		
			pw.println(menu);			
			System.out.println(menu+" �ֹ�!");
		}
		pw.close();// flush (���ۿ� �ִ� �����͸� ���) �� ��Ʈ���� �ݴ´� 
		s.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}





