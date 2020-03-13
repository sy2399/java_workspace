package step4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MemoService {
	/*
	 * throws : FileNotFoundException 발생시 호출한 곳으로 
	 * 				던진다는 의미 
	 */
	public void readMemo(String fileName) throws FileNotFoundException {		
		new FileReader(fileName);		
		System.out.println(fileName+" 메모 읽기 작업을 진행");
	}
}








