package step2;
class ErrorEx{
	public void a(){
		System.out.println("a �޼��� ����");
		b();
	}
	public void b(){
		System.out.println("b �޼��� ����");
		a();
	}
}
public class TestError {
	public static void main(String[] args) {
		ErrorEx ex=new ErrorEx();
		ex.a();
		//�� �޼��带 ȣ���ϸ� Error�� �߻� 
		//�� ��� ���α׷��� �����ϰų� ȯ���� �����ؾ� �Ѵ� 
	}
}












