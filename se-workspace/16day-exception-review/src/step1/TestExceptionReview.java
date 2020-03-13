package step1;

import java.util.Scanner;

public class TestExceptionReview {
	/*	계좌서비스 입금시 
	 * 금액이 0원 이하이면 InvalidMoneyException을 발생시키고 
	 * 호출한 곳으로 해당 Exception을 전달하는 구조 
	 * 
	 */
	public static void main(String[] args) {
		AccountService service=new AccountService();
		System.out.println("입금할 금액을 입력하세요");
		Scanner s=new Scanner(System.in);
		try{
			int money=Integer.parseInt(s.nextLine());
			service.deposit(money);
			System.out.println("입금완료 후 작업");
		}catch(NumberFormatException ne){
			System.out.println("금액을 숫자로 입력하세요!");
		}catch (InvalidMoneyException e) {
			System.out.println(e.getMessage());
		}finally{
			s.close();
		}
	}
}














