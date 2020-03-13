package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestOutput {
	public static void main(String[] args) {
		try {
			//파일에 연결되는 노드스트림: 파일이 없으면 생성해준다 
			//두번째 인자값으로 true 는 append 덧붙이기 
			FileWriter fw
			=new FileWriter("C:\\java-kosta\\test\\memo.txt",true);
			//문자열 출력하기 위한 프로세스 스트림 
			PrintWriter pw=new PrintWriter(fw);
			pw.println("방가방가 IO");
			pw.close();
			System.out.println("작업완료");
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}






