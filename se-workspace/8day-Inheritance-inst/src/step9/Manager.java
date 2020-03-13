package step9;

public class Manager extends Employee{
	private String department;
	public Manager(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	public String getDetails(){//�޼��� �������̵� 
		//super�� �̿��� �θ� �޼��带 ���� 
		return super.getDetails()+" �μ���:"+department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
