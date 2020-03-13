package step1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
// 1byte 단위 출력스트림을 이용 
public class TestOutput {
	public static void main(String[] args) {
		try {
			FileOutputStream fos
				=new FileOutputStream("C:\\java-kosta\\test\\output.txt");
			PrintStream ps=new PrintStream(fos);
			ps.println("하하하");
			System.out.println("출력완료");
			ps.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
	}
}






