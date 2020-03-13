package step9;

public class Manager extends Employee{
	private String department;
	public Manager(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	public String getDetails(){//메서드 오버라이딩 
		//super를 이용해 부모 메서드를 재사용 
		return super.getDetails()+" 부서명:"+department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
