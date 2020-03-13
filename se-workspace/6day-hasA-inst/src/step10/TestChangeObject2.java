package step10;

import step9.Friend;

class ObjectService{
	public void pass(Friend f){
		//f.setName("서현");
		f=new Friend("아이유",22);
	}
}
public class TestChangeObject2 {
	public static void main(String[] args) {
		ObjectService service=new ObjectService();
		Friend f=new Friend("설현",22);
		System.out.println(f.getName());
		service.pass(f);
		System.out.println(f.getName());
	}
}





