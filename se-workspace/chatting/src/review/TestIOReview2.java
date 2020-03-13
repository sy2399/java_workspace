package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * System.in : InputStream Ÿ������ 8bit ���� ByteStream
 * 				 �ַܼκ��� ������ �Է½� ����ϴ� ��� ��Ʈ�� 
 * 				 ��� ��Ʈ���̶� ���� ��ġ �Ǵ� �ڿ��� ����Ǵ� ��Ʈ�� 
 * InputStreamReader : 8bit ByteStream �� 16bit CharacterStream���� 
 * 							��ȯ�ϴ� ���μ���(����) ��Ʈ�� 
 * 						    ���μ���(����) ��Ʈ���̶� 
 * 						    ���� ��Ʈ���� ����Ǿ� �پ��� ����� �����ϴ� ��Ʈ�� 
 */
public class TestIOReview2 {
	// System.in < InputStreamReader < BufferedReader 
	public static void main(String[] args) {
		//�ֿܼ� ����Ǵ� 8bit ������ ��� ��Ʈ��
		InputStream is=System.in; 
		//16bit ������Ʈ������ ��ȯ
		InputStreamReader ir=new InputStreamReader(is); 
		BufferedReader br=new BufferedReader(ir);
		try {
			System.out.println("���� ����:"+br.readLine());
			br.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}











