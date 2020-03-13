package step2;

public class SuperMan extends ET implements Flyer,Fighter{
	@Override
	public void fight() {
		System.out.println("수퍼맨이 악당과 싸우다");
	}
	@Override
	public void fly() {
		System.out.println("수퍼맨이 날다");
	}
}



