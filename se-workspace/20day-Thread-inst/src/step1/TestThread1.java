package step1;
class Worker{
	public void work(){
		for(int i=0;i<100;i++)
		System.out.println("������ ���� �ϴ� "+i);
	}
}
/* main thread �ϳ��� ���۵ǹǷ� 
 * ������ ���� �ϴ�  work() �޼��尡 ������ ���ľ� 
 * main thread�� ����ȴ�. �� ���������� ���� �Ѵ� 
 * 
 */
public class TestThread1 {
	public static void main(String[] args) {
		Worker w=new Worker();
		w.work();
		System.out.println("main thread ����");
	}
}






