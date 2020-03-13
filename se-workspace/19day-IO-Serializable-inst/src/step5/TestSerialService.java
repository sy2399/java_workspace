package step5;

import java.io.IOException;

public class TestSerialService {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\serial\\member.obj";
		SerialService service=new SerialService(path);	
		try {
			service.registerMember(
					new MemberVO("java","angel","아이유","판교"));
			System.out.println("회원 객체 직렬화하여 파일에 저장");
		} catch (IOException e) {		
			e.printStackTrace();
		}		
	}
}





