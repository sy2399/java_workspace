package step7;

public class TestSuper4 {
	public static void main(String[] args) {
		Employee e=new Employee("������",300);
		System.out.println(e.getName()+" "+e.getSalary());
		Manager m=new Manager("���缮",500,"������");
		System.out.println(m.getName()+" "+m.getSalary()
		+" "+m.getDepartment());
		// �Ŵ����� ����̴�. �� �Ŵ����� ����� ��ӹ޴´� 
	}
}







