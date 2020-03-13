package step3;

import step2.Fighter;
import step2.Flyer;

public class IronMan implements Flyer,Fighter{
	@Override
	public void fight() {
		System.out.println("아이언맨이 악당과 싸우다");
	}
	@Override
	public void fly() {
		System.out.println("아이언맨이 날다");
	}
}



