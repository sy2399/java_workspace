package step4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MemoService {
	/*
	 * throws : FileNotFoundException �߻��� ȣ���� ������ 
	 * 				�����ٴ� �ǹ� 
	 */
	public void readMemo(String fileName) throws FileNotFoundException {		
		new FileReader(fileName);		
		System.out.println(fileName+" �޸� �б� �۾��� ����");
	}
}








