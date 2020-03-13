package step8;
class BackUpWorker extends Thread{
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println("백업작업");
		}
	}
}
class NotePad extends Thread{
	@Override
	public void run() {
		/*
		 * 워드작업시작시 백업스레드를 start 시킨다 
		 * 실행을 해보면 워드 작업 종료 후에도 
		 * 계속 백업스레드는 실행이 지속된다 
		 * 워드 작업 종료되면 백업스레드도 같이 종료되도록
		 * Thread의 setDaemon(true)를 설정한다 
		 */
		BackUpWorker backup=new BackUpWorker();
		//자신을 start 시킨 스레드(NotePad)가 종료되면 
		//함께 종료되도록 설정 
		backup.setDaemon(true);
		backup.start();
		for(int i=0;i<10;i++){
			System.out.println("워드작업 "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
		System.out.println("워드 작업 종료");
	}
}
public class TestDaemonThread {
	public static void main(String[] args) {
		new NotePad().start();		
	}
}







