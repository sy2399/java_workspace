package step2;
/* ��Ƽ �����带 �����ؼ� �����غ��� 
 *  Main Thread + Worker Thread  ���ÿ� �ΰ��� �����带 ������� �� 
 *  ����� Ȯ���Ѵ� ( step1 ������ � �������� �ִ� �� �м� ) 
 */
class Worker extends Thread{
	// run()�� �������̵��Ͽ� Worker �������� �۾� ������ �����Ѵ� 
	@Override
	public void run(){
		for(int i=0;i<100;i++)
			System.out.println("����(������) ���� �ϴ� "+i);
	}	
}
public class TestThread2 {
	public static void main(String[] args) {
		Worker wt=new Worker(); // ������ ���� 
		// �����带 ���డ�ɻ��·� ������. jvm�� �����ٸ��� �ϸ� ����ȴ�
		//( jvm�� ���� run()�� ȣ��ȴٴ� ���� �ǹ�)
		wt.start(); 		
		System.out.println("���� ������ ����");
	}
}
















