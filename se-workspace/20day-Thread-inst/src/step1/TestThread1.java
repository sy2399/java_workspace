package step1;
class Worker{
	public void work(){
		for(int i=0;i<100;i++)
		System.out.println("직원이 일을 하다 "+i);
	}
}
/* main thread 하나가 동작되므로 
 * 직원이 일을 하다  work() 메서드가 실행을 마쳐야 
 * main thread가 종료된다. 즉 순차적으로 일을 한다 
 * 
 */
public class TestThread1 {
	public static void main(String[] args) {
		Worker w=new Worker();
		w.work();
		System.out.println("main thread 종료");
	}
}






