package step9;
class ObjectService{
	public void test1(Friend f){
		f=new Friend("우병우",50);
	}
	public void test2(Friend f){
		f.setName("최순실");
	}
}
public class TestChangeObject {
	public static void main(String[] args) {
		ObjectService service=new ObjectService();
		Friend f=new Friend("설현",20);
		service.test1(f);
		System.out.println(f.getName());
		service.test2(f);		
		System.out.println(f.getName());
	}
}



