package step6;

import java.io.File;

// ���� �̵� :  renameTo()
public class TestFile7 {
	public static void main(String[] args) {
		File orgFile=new File("C:\\java-kosta\\test\\media\\a.txt");
		File destFile=new File("C:\\java-kosta\\test\\a.txt");
		boolean moveFlag=orgFile.renameTo(destFile);
		System.out.println("�̵� "+moveFlag);
	}
}










