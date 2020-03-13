package step5;

public class Person {
	private String name;
	public Person(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void tour() {
		// 렌트카를 이용한다 : use a 관계 
		RentCar rc=new RentCar("소나타",10);
		System.out.println(
			rc.getModel()+" 타고 "+name+" 여행하다");
		//이 메서드가 종료되면 RentCar 객체는 
		//Garbage Collection 대상이 된다 
	}
}





