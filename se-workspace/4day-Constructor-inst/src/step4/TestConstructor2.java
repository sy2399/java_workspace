package step4;

public class TestConstructor2 {
	public static void main(String[] args) {
		Car c=new Car("¼Ò³ªÅ¸");
		System.out.println(c.getModel());
		c.setModel("º¥Ã÷");
		System.out.println(c.getModel());
	}
}
