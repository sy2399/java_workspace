package step11;
/*
 *  step9 단일 스레드 환경에서 테스트 
 * ( 순차적으로 실행하므로 문제 없다 )
 * 
 *  step10  멀티 스레드 환경에서 테스트 
 *  			공유자원( Toilet 객체의 데이터( instance variable : seat ) ) 
 *              을 여러 스레드가 동시에 사용하여 발생할 수 있는 
 *              문제를 보여준다 
 *   step11 
 *   			공유자원에 접근하는 메서드 (or 코드영역)에 
 *   			단일 스레드 환경으로 만드는 synchronized 처리를 한다            
 */
class Toilet implements Runnable{
	private  boolean seat;// 디폴트 초기화 false
	@Override
	public void run() {
		try {
			use(Thread.currentThread().getName());
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	}
	// synchronized 처리로 해당 메서드는 순차적으로 
	// Thread가 실행되도록 처리한다 (단일스레드환경으로 만듬)
	public synchronized void use(String user) throws InterruptedException{
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
public class TestSynchronized3 {
	public static void main(String[] args) throws InterruptedException {
		Toilet t=new Toilet(); // 공유 객체 
		Thread userThread1=new Thread(t,"호겸부반장");
		Thread userThread2=new Thread(t,"규익부반장");
		Thread userThread3=new Thread(t,"문일민정수석");
		userThread1.start();
		userThread2.start();
		userThread3.start();
	}
}

















