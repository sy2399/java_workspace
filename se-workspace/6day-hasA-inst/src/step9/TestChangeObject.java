package step9;
class ObjectService{
	public void test1(Friend f){
		f=new Friend("�캴��",50);
	}
	public void test2(Friend f){
		f.setName("�ּ���");
	}
}
public class TestChangeObject {
	public static void main(String[] args) {
		ObjectService service=new ObjectService();
		Friend f=new Friend("����",20);
		service.test1(f);
		System.out.println(f.getName());
		service.test2(f);		
		System.out.println(f.getName());
	}
}



