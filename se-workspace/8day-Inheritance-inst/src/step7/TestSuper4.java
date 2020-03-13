package step7;

public class TestSuper4 {
	public static void main(String[] args) {
		Employee e=new Employee("아이유",300);
		System.out.println(e.getName()+" "+e.getSalary());
		Manager m=new Manager("유재석",500,"영업부");
		System.out.println(m.getName()+" "+m.getSalary()
		+" "+m.getDepartment());
		// 매니저는 사원이다. 즉 매니저는 사원을 상속받는다 
	}
}







