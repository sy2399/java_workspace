package step4;

import java.io.IOException;

public class TestFile5 {
	public static void main(String[] args) {
		FileService service=new FileService();
		String dir="C:\\java-kosta\\test\\media2";
		String info
		="���ٰ���.mp3,ù��ó���ʿ��԰��ڴ�.mp3,"
				+ "�����̸���.mp4,��󷣵�.avi";
		try{
		service.makeDirAndFiles(dir,info);
		System.out.println("���丮�� ���� 4�� ���� �Ϸ�");
		}catch (IOException e) { // 3�� 20�п� Ǯ�� 
			e.printStackTrace();
		}
	}
}













