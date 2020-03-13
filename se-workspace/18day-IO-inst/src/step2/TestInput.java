package step2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput {
	public static void main(String[] args) {		 
		try {
			//파일에 연결되는 입력 노드 스트림
			FileReader fr=new FileReader("C:\\java-kosta\\test\\점심메뉴.txt");
			//입력 프로세스 스트림 
			BufferedReader br=new BufferedReader(fr);
			//한라인씩 입력받아본다 
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			//더 이상 입력받을 내용이 없으면 null을 반환한다 
			System.out.println(br.readLine());
			br.close();
			System.out.println("입력작업완료!");
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		}
	}
}










