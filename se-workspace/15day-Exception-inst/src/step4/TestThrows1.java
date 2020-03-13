package step4;

import java.io.FileNotFoundException;

public class TestThrows1 {
	public static void main(String[] args)  {
		MemoService service=new MemoService();
		//String fileName="C:\\java-kosta\\a.txt"; // 존재하는 파일 
		String fileName="C:\\java-kosta\\b.txt"; // 존재하지 않는 파일
		try {
			service.readMemo(fileName);
			System.out.println("메모 읽기 완료^^");
		} catch (FileNotFoundException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();//예외메세지와 발생 경로를 보여준다 
		}
		System.out.println("정상 수행 후 종료");
	}
}




