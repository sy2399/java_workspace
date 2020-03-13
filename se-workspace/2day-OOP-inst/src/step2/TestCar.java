package step2;

public class TestCar {
	public static void main(String[] args) {
		// Car 객체를 c1이라는 변수로 생성한다 
		Car c1=new Car(); 
		// c1 객체의 model 변수에 sm5를 저장한다 
		c1.model="sm5";
		// c1 객체의 model 변수정보를 출력해본다 
		System.out.println(c1.model);
		// c1 객체의 price 변수에 2000을 저장한다 
		c1.price=2000;
		// c1 객체의 price 를 출력 
		System.out.println(c1.price);
		/*
		 *  c2 변수에 Car 객체를 새로 생성 
		 *  c2 객체의 model 변수에 소나타를 할당 
		 *  c2 객체의 price 변수에 2500을 할당 
		 *  출력은 소나타 2500 이 되도록 코딩 
		 */
		Car c2=new Car();
		c2.model="소나타";
		c2.price=2500;
		System.out.println(c2.model+" "+c2.price);
	}
}













