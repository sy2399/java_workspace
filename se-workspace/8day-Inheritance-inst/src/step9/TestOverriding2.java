package step9;

public class TestOverriding2 {
	public static void main(String[] args) {
		Employee e=new Employee("아이유",300);
		Manager m=new Manager("김구라",500,"영업부");
		System.out.println(e.getDetails());
		//  사원명:아이유 월급:300
		System.out.println(m.getDetails());
		//  사원명:김구라 월급:500 부서명:영업부 
	}
}




