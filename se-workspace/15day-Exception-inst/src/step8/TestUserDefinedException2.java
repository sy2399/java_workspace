package step8;

import java.util.Scanner;

public class TestUserDefinedException2 {
	public static void main(String[] args) {
		System.out.println(
				"닉네임을 입력하세요(2자 이상 5자 이하만 등록가능)");
		Scanner scan=new Scanner(System.in);
		String nickName=scan.nextLine();
		MemberService service=new MemberService();
		try{
		service.register(nickName);		
		}catch(NickNameException e){
			System.out.println(e.getMessage());
		}
		/*  2자~5자 닉네임일 경우 
		 *  큰그림 닉네임 카페 등록 완료
		 *  2자~5자 닉네임이 아닐 경우 
		 *  헐 닉네임은 등록될 수 없습니다 ( 2자 이하 5자 이하만 가능 ) 
		 */
		scan.close();
	}
}









