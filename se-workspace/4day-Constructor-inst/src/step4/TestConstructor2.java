package step4;

public class TestConstructor2 {
	public static void main(String[] args) {
		Car c=new Car("�ҳ�Ÿ");
		System.out.println(c.getModel());
		c.setModel("����");
		System.out.println(c.getModel());
	}
}
