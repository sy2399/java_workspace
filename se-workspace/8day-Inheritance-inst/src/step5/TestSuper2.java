package step5;
class Parent{
	private String name;	
	public Parent(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
//class Child extends Parent{
	// �θ� ������ �Ű������� �´� �����͸� �Է��ؾ� �Ѵ�
	//�Ʒ��� �⺻ �����ڸ� ȣ���ϹǷ� compile error �߻� 
	//Child(){super();} 
//}
class Child2 extends Parent{
	private String id;
	public Child2(String name,String id){
		super(name);// �θ� �����ڿ� �°� super ȣ��� ������ ����
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
}
public class TestSuper2 {
	public static void main(String[] args) {
		Child2 c=new Child2("������","java");
		System.out.println(c.getName());//��ӹ޾����Ƿ� ��밡��
		System.out.println(c.getId());
	}
}













