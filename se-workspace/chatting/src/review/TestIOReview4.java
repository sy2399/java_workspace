package review;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * �ַܼκ��� �����͸� �Է¹޾� 
 * CommonInfo �� FILE_PATH2 ���Ͽ� �����ϴ� Ŭ���� 
 */
public class TestIOReview4 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		try {
			/*PrintWriter pw=new PrintWriter(
					new FileWriter(CommonInfo.FILE_PATH2));*/
			//API DOC: PrintWriter(OutputStream out, boolean autoFlush)
			//autoFlush �� true�� �Ҵ��ϸ� println() ����� ��� ������ ���
			//�� �κ� �����ֿ� �Ǽ��ϸ� �뷡�ϱ�!!!!! 
			PrintWriter pw=new PrintWriter(
					new FileWriter(CommonInfo.FILE_PATH2),true);
			System.out.println("�޴� �Է�");
			while(true){
				String data=br.readLine();
				if(data.equals("�ֹ���")){
					break;
				}
				System.out.println(data+" �ֹ�ó��");
				pw.println(data);
			}
			pw.close();
			br.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}











