package step5;

import java.io.IOException;

public class TestSerialService {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\serial\\member.obj";
		SerialService service=new SerialService(path);	
		try {
			service.registerMember(
					new MemberVO("java","angel","������","�Ǳ�"));
			System.out.println("ȸ�� ��ü ����ȭ�Ͽ� ���Ͽ� ����");
		} catch (IOException e) {		
			e.printStackTrace();
		}		
	}
}





