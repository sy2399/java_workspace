package step6;

public class Student {
	private String name;
	private String stuId;
	private SmartPhone smartPhone;
	public Student(String name,String stuId,
			SmartPhone smartPhone){
		this.name=name;
		this.stuId=stuId;
		this.smartPhone=smartPhone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public SmartPhone getSmartPhone() {
		return smartPhone;
	}
	public void setSmartPhone(SmartPhone smartPhone){
		this.smartPhone=smartPhone;
	}
}











