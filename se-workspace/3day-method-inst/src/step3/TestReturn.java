package step3;

public class TestReturn {
	public static void main(String[] args) {
		Person p=new Person();
		//System.out.println(p.getNickName());
		//System.out.println("리턴값:"+p.getNickName());
		//위 코드를 풀어서 표현하면 
		String data="리턴값:"+p.getNickName();
		System.out.println(data);
	}
}







