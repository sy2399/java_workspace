package step4;

import java.io.IOException;

public class TestFile4 {
	public static void main(String[] args) {
		String movieFilePath
		="C:\\java-kosta\\test\\media\\movie\\나홀로집에.mp4";
		FileService service=new FileService();
		try{
			service.makeDirAndFile(movieFilePath);
			System.out.println(movieFilePath+" 작업완료!");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}





