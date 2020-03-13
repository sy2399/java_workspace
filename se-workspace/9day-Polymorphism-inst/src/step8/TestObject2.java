package step8;
class Company{
	private String name;
	private String address;
	public Company(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
}
class Company2{
	private String name;
	private String address;
	public Company2(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	//Object class의 toString 메서드를 오버라이딩 
	public String toString(){
		return "회사명:"+name+" 주소:"+address;
	}
}
public class TestObject2 {
	/* java.lang.Object 최상위 클래스의 toString() 메서드를 
	 * 오버라이딩하여 객체의 주소값 대신 객체의 속성정보를 
	 * 반환하도록 처리해본다 
	 * 
	 */
	public static void main(String[] args) {
		Company c1=new Company("미르","강남");
		Company c2=new Company("K","서초");
		System.out.println(c1.toString());//주소값 출력 
		System.out.println(c1);
		System.out.println(c2);//위와 동일하게 객체의 주소값 출력 
		System.out.println(c2.toString());
		System.out.println("*****************");
		Company2 com=new Company2("구글","실리콘밸리");
		System.out.println(com.toString());//주소값 대신 객체 정보 출력
		System.out.println(com);
		System.out.println("*****************");
		Object objCom[]={
				new Company2("애플","구미"),
				new Company2("NC","판교"),
				new Company2("다음카카오","제주"),
		};
		//for문 이용해 다음과 같이 출력한다 
		for(int i=0;i<objCom.length;i++){
			System.out.println(objCom[i]);
		}
		/* 회사명:애플 주소:구미
		 * 회사명:NC  주소:판교
		 * 회사명:다음카카오 주소:제주 
		 */
	}
}













