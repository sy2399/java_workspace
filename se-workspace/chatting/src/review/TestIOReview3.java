package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*	�޴� �Է�
 *  ������ <- �Է�
 *  ������ �ֹ�ó�� 
 *  ���� <- �Է� 
 *  ���� �ֹ�ó�� 
 *  �ֹ��� 
 *   System.in < InputStreamReader < BufferedReader �� �̿��� ���� ���� ����
 */
public class TestIOReview3 {
	public static void main(String[] args) {
		BufferedReader br
			=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("�޴� �Է�");
			while(true){
				String order=br.readLine();
				if(order.equals("�ֹ���"))
					break;
				System.out.println(order+" �ֹ�ó��");
			}
			br.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}









