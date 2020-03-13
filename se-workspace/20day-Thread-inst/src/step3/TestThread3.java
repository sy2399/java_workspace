package step3;
// implements Runnable 
class Worker implements Runnable{
	// Worker thread의 실행 내용 	
	// jvm에 의해 실행 
	@Override
	public void run() {	
		for(int i=0;i<100;i++)
			System.out.println("worker thread 실행 "+i);
	}	
}
public class TestThread3 {
	public static void main(String[] args) throws InterruptedException {
		Worker worker=new Worker();
		Thread t=new Thread(worker);
		t.start();
		Thread.sleep(1);//메인 스레드 0.001초 중단 후 재개 
		System.out.println("main thread 종료");
	}
}











