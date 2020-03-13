package step6;

import step4.Animal;
import step4.Monkey;
import step4.Person;
import step4.Tiger;

public class TestPolymorphism8 {
	public static void main(String[] args) {
		ZooMgr mgr=new ZooMgr();
		Animal ani[]={new Tiger(),new Monkey(),new Person()};
		mgr.enter(ani);
		/* 호랑이가 사냥하며 놀다
		 * 원숭이가 나무타며 놀다
		 * 사람이 티켓을 구매하다
		 * 사람이 데이트하며 놀다 
		 */
	}
}








