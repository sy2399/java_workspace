package step2;
class Employee{//extends Object
	public void calSalary(){
		System.out.println("일반사원 월급계산");
	}
}
class Manager extends Employee{
	public void calSalary(){//메서드 오버라이딩 
		System.out.println("매니저 월급계산");
	}
}
class Engineer extends Employee{
	public void calSalary(){//메서드 오버라이딩 
		System.out.println("엔지니어 월급계산");
	}	
}
class HRService{
	//공통 부모 타입의 변수로 다양한 객체를 처리한다 
	public void process(Employee e) {	
		//오버라이딩한 메서드를 호출하면 
		//다양한 객체들이 각자의 방식으로 동작한다 
		e.calSalary();
	}
}
public class TestPolymorphism4 {
	public static void main(String[] args) {
		HRService service=new HRService();
		service.process(new Manager());
		service.process(new Engineer());
		service.process(new Employee());
	}
}










