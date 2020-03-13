package school;

public class Teacher extends Person{
	private static final long serialVersionUID = 1L;
	private String subject;
	public Teacher(String tel, String name, String address, String subject) {
		super(tel, name, address);
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return super.toString()+" subject=" + subject;
	}	
}






