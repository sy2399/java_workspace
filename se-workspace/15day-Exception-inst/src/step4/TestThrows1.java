package step4;

import java.io.FileNotFoundException;

public class TestThrows1 {
	public static void main(String[] args)  {
		MemoService service=new MemoService();
		//String fileName="C:\\java-kosta\\a.txt"; // �����ϴ� ���� 
		String fileName="C:\\java-kosta\\b.txt"; // �������� �ʴ� ����
		try {
			service.readMemo(fileName);
			System.out.println("�޸� �б� �Ϸ�^^");
		} catch (FileNotFoundException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();//���ܸ޼����� �߻� ��θ� �����ش� 
		}
		System.out.println("���� ���� �� ����");
	}
}




