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
	// 부모 생성자 매개변수에 맞는 데이터를 입력해야 한다
	//아래는 기본 생성자를 호출하므로 compile error 발생 
	//Child(){super();} 
//}
class Child2 extends Parent{
	private String id;
	public Child2(String name,String id){
		super(name);// 부모 생성자에 맞게 super 호출시 데이터 전달
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
		Child2 c=new Child2("아이유","java");
		System.out.println(c.getName());//상속받았으므로 사용가능
		System.out.println(c.getId());
	}
}













