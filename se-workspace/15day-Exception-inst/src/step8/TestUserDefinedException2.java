package step8;

import java.util.Scanner;

public class TestUserDefinedException2 {
	public static void main(String[] args) {
		System.out.println(
				"�г����� �Է��ϼ���(2�� �̻� 5�� ���ϸ� ��ϰ���)");
		Scanner scan=new Scanner(System.in);
		String nickName=scan.nextLine();
		MemberService service=new MemberService();
		try{
		service.register(nickName);		
		}catch(NickNameException e){
			System.out.println(e.getMessage());
		}
		/*  2��~5�� �г����� ��� 
		 *  ū�׸� �г��� ī�� ��� �Ϸ�
		 *  2��~5�� �г����� �ƴ� ��� 
		 *  �� �г����� ��ϵ� �� �����ϴ� ( 2�� ���� 5�� ���ϸ� ���� ) 
		 */
		scan.close();
	}
}









