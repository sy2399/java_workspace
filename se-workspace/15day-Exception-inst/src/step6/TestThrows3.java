package step6;

import java.io.IOException;

class MemberDAO{
	public void register(String info) throws IOException{
		if(info.equals("")){			
			throw new IOException("공란은 등록할 수 없음!");
		}
		System.out.println("D");		
	}
}
class MemberService{
	public void register(String info) throws IOException{
		MemberDAO dao=new MemberDAO();
		try{
			dao.register(info);
			System.out.println("E");
		}finally{
			System.out.println("F");
		}
	}
}
public class TestThrows3 {
	public static void main(String[] args) {
		MemberService service=new MemberService();
		try {
			service.register("");
			System.out.println("A");
		} catch (IOException e) {		
			System.out.println("C");		
			System.out.println(e.getMessage());
		}
		System.out.println("B");
	}
}












