package step5;

public class TestSerialService2 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\serial\\member.obj";
		SerialService service=new SerialService(path);	
		try{
		MemberVO vo=service.readMemberVO();
		System.out.println(vo.getId()); // java
		System.out.println(vo.getPassword()); // null
		System.out.println(vo.getName()); // ������
		System.out.println(vo.getAddress());// �Ǳ�
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}






