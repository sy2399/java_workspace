package review;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestIOReview {
	/**
	 * CommonInfo �� FILE_PATH ������ ������ ������ ��
	 * ����
	 * ������
	 * ������ 
	 * ������ ���Ͽ� ����Ѵ� 
	 * @param args
	 */
	public static void main(String[] args) {
		File file=new File(CommonInfo.FILE_PATH);
		file.getParentFile().mkdirs();
		try {
			FileWriter fw=new FileWriter(file);
			PrintWriter pw=new PrintWriter(fw);
			pw.println("����");
			pw.println("������");
			pw.println("������");
			pw.close();//flush (������ �ϰ� ���) �� ��Ʈ���� ���� 
	        System.out.println("��¿Ϸ�");
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}










