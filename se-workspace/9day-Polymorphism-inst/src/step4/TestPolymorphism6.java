package step4;

public class TestPolymorphism6 {
	public static void main(String[] args) {
		ZooService service=new ZooService();
		service.enter(new Monkey());
		service.enter(new Tiger());
		service.enter(new Person());
		/* �����̰� ����Ÿ�� ���
		 * ȣ���̰� ����ϸ� ��� 
		 * ����� Ƽ���� �����ϴ� 
		 * ����� ����Ʈ�ϸ� ���      
		 */
	}
}







