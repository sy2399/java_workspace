package step2;
class Employee{//extends Object
	public void calSalary(){
		System.out.println("�Ϲݻ�� ���ް��");
	}
}
class Manager extends Employee{
	public void calSalary(){//�޼��� �������̵� 
		System.out.println("�Ŵ��� ���ް��");
	}
}
class Engineer extends Employee{
	public void calSalary(){//�޼��� �������̵� 
		System.out.println("�����Ͼ� ���ް��");
	}	
}
class HRService{
	//���� �θ� Ÿ���� ������ �پ��� ��ü�� ó���Ѵ� 
	public void process(Employee e) {	
		//�������̵��� �޼��带 ȣ���ϸ� 
		//�پ��� ��ü���� ������ ������� �����Ѵ� 
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










