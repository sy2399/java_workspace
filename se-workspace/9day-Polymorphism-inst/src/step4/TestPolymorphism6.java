package step4;

public class TestPolymorphism6 {
	public static void main(String[] args) {
		ZooService service=new ZooService();
		service.enter(new Monkey());
		service.enter(new Tiger());
		service.enter(new Person());
		/* 원숭이가 나무타며 놀다
		 * 호랑이가 사냥하며 놀다 
		 * 사람이 티켓을 구매하다 
		 * 사람이 데이트하며 놀다      
		 */
	}
}







