package step4;
class Car{
	int count; // instance variable : heap 영역 저장 , 객체 생성시마다 별도 공간에 저장 
	static int sCount; // class variable : method area 영역 저장  , class loading시에 한번 공간 생성되어 저장
	Car(){
		count++;
		sCount++;
	}
}
/*
 *   인스턴스 변수 정보와 static 변수 정보의 적재시 어떤 
 *   차이를 보이는 가에 대한 예제 
 */
public class TestStatic3 {
	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println(c1.count);
		System.out.println(Car.sCount);
		Car c2=new Car();
		System.out.println(c2.count);
		System.out.println(Car.sCount);
		Car c3=new Car();
		System.out.println(c3.count);
		System.out.println(Car.sCount);
	}
}



