package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestOutput2 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\점심메뉴.txt";
		try {
		FileWriter fw=new FileWriter(path);
		PrintWriter pw=new PrintWriter(fw,true);//true : autoflush 		
		Scanner s=new Scanner(System.in);
		System.out.println("**점심메뉴**");
		while(true){			
			String menu=s.nextLine();
			if(menu.equals("주문끝")){
				System.out.println("주문이 완료되었습니다!");
				break;
			}		
			pw.println(menu);			
			System.out.println(menu+" 주문!");
		}
		pw.close();// flush (버퍼에 있는 데이터를 출력) 후 스트림을 닫는다 
		s.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}





