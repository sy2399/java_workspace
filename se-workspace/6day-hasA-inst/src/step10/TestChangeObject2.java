package step10;

import step9.Friend;

class ObjectService{
	public void pass(Friend f){
		//f.setName("����");
		f=new Friend("������",22);
	}
}
public class TestChangeObject2 {
	public static void main(String[] args) {
		ObjectService service=new ObjectService();
		Friend f=new Friend("����",22);
		System.out.println(f.getName());
		service.pass(f);
		System.out.println(f.getName());
	}
}





