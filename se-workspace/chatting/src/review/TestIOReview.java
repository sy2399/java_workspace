package review;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestIOReview {
	/**
	 * CommonInfo 의 FILE_PATH 정보로 파일을 생성한 후
	 * 설현
	 * 아이유
	 * 케이윌 
	 * 정보를 파일에 기록한다 
	 * @param args
	 */
	public static void main(String[] args) {
		File file=new File(CommonInfo.FILE_PATH);
		file.getParentFile().mkdirs();
		try {
			FileWriter fw=new FileWriter(file);
			PrintWriter pw=new PrintWriter(fw);
			pw.println("설현");
			pw.println("아이유");
			pw.println("케이윌");
			pw.close();//flush (데이터 일괄 출력) 및 스트림을 닫음 
	        System.out.println("출력완료");
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}










