package step3;
// implements Runnable 
class Worker implements Runnable{
	// Worker thread�� ���� ���� 	
	// jvm�� ���� ���� 
	@Override
	public void run() {	
		for(int i=0;i<100;i++)
			System.out.println("worker thread ���� "+i);
	}	
}
public class TestThread3 {
	public static void main(String[] args) throws InterruptedException {
		Worker worker=new Worker();
		Thread t=new Thread(worker);
		t.start();
		Thread.sleep(1);//���� ������ 0.001�� �ߴ� �� �簳 
		System.out.println("main thread ����");
	}
}











