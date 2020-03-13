package step8;

public class MemberService {

	public void register(String nickName) throws NickNameException {
		// database 에 등록 ......
		if(nickName.length()<2||nickName.length()>5)
			throw new NickNameException(nickName
					+" 닉네임은 등록될 수 없습니다 ( 2자 이하 5자 이하만 가능 )");
		System.out.println(nickName+" 닉네임 카페 등록 완료");
	}
}
