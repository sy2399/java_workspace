package step4;

import java.io.IOException;

public class TestFile4 {
	public static void main(String[] args) {
		String movieFilePath
		="C:\\java-kosta\\test\\media\\movie\\��Ȧ������.mp4";
		FileService service=new FileService();
		try{
			service.makeDirAndFile(movieFilePath);
			System.out.println(movieFilePath+" �۾��Ϸ�!");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}





