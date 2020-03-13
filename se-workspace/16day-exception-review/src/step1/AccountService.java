package step1;

public class AccountService {

	public void deposit(int money) throws InvalidMoneyException {
		try{
			if(money<=0)
				throw new InvalidMoneyException(
						money+"원은 잘못된 입금액입니다!");
			System.out.println(money+"원 입금완료");
		}finally{// Exception 발생 여부와 관계없이 항상 실행
			System.out.println("거래 이력을 남긴다");
		}
	}
}
