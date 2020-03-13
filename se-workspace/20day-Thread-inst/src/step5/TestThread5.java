package step5;
/* 하나의 클래스를 이용하여 다수의 스레드를 생성하여 실행하는 예제 
 *  
 * 서버에서 동일한 서비스를 제공 ( ex - 채팅 or 로그인 or 검색 )
 *  --> Thread class 1개 정의  
 *  다수의 클라이언트가 동시에 접속하면 
 *  서버에서는 클라이언트의 수와 같은 스레드를 생성해야 한다 
 *  --> Thread 생성은 클라이언트 수만큼 생성해야 한다 
 */
class ServerWorker implements Runnable{
	public void run(){
		String name=Thread.currentThread().getName();
		System.out.println("**"+name+"** 우선순위:"
								+Thread.currentThread().getPriority());
		for(int i=0;i<10;i++){
			if(name.equals("첫번째 일꾼")){
				try {
					Thread.sleep(1000);//1초 간격으로 중단 후 실행 재개 
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
			}
			System.out.println(name+" ServerWorker Thread 실행-검색서비스"+i);
		}
	}
}
public class TestThread5 {
	public static void main(String[] args) {
		ServerWorker sw=new ServerWorker();
		Thread t1=new Thread(sw,"첫번째 일꾼");
		Thread t2=new Thread(sw,"두번째 일꾼");	
		t1.start(); t2.start();
		System.out.println("main thread 종료");
	}
}







