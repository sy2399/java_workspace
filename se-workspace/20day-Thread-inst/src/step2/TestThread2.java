package step2;
/* 멀티 스레드를 정의해서 실행해본다 
 *  Main Thread + Worker Thread  동시에 두가지 스레드를 실행시켜 본 
 *  결과를 확인한다 ( step1 예제와 어떤 차이점이 있는 지 분석 ) 
 */
class Worker extends Thread{
	// run()을 오버라이딩하여 Worker 스레드의 작업 내용을 정의한다 
	@Override
	public void run(){
		for(int i=0;i<100;i++)
			System.out.println("직원(스레드) 일을 하다 "+i);
	}	
}
public class TestThread2 {
	public static void main(String[] args) {
		Worker wt=new Worker(); // 스레드 생성 
		// 스레드를 실행가능상태로 보낸다. jvm이 스케줄링을 하면 실행된다
		//( jvm에 의해 run()가 호출된다는 것을 의미)
		wt.start(); 		
		System.out.println("메인 스레드 종료");
	}
}
















