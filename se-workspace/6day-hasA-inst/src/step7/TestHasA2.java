package step7;

public class TestHasA2 {
	public static void main(String[] args) {
		Car c=new Car("소나타",new Engine("GDI",2500));
		System.out.println(c.getModel());//소나타
		System.out.println(c.getEngine().getType());//GDI
		System.out.println(c.getEngine().getDisplacement());//2500
		c.getEngine().setType("Hybrid");
		System.out.println(c.getEngine().getType());//Hybrid
	}
}





