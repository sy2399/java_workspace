package step6;

public class Teacher extends Person{
	private String subject;
	public Teacher(String name,String subject){
		super(name);
		this.subject=subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
