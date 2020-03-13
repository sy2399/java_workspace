package step9;
/*
 * 단일 스레드 환경에서 테스트 
 * ( 순차적으로 실행하므로 문제 없다 ) 
 */
class Toilet{
	private  boolean seat;// 디폴트 초기화 false 
	public void use(String user) throws InterruptedException{
		if(seat==false){
		Thread.sleep(1000);
		System.out.println(user+" 입장");
		Thread.sleep(1000);
		seat=true;
		System.out.println(user+" 사용");
		Thread.sleep(2000);
		seat=false;
		System.out.println(user+" 나옴");
		}else{
			System.out.println(user+"님 현재 화장실 사용중이므로 사용불가~");
		}
	}
}
public class TestSynchronized1 {
	public static void main(String[] args) throws InterruptedException {
		Toilet t=new Toilet();
		t.use("호겸부반장");
		t.use("규익반장");
	}
}

















