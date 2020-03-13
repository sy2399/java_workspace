package step11;
/*
 *  step9 ���� ������ ȯ�濡�� �׽�Ʈ 
 * ( ���������� �����ϹǷ� ���� ���� )
 * 
 *  step10  ��Ƽ ������ ȯ�濡�� �׽�Ʈ 
 *  			�����ڿ�( Toilet ��ü�� ������( instance variable : seat ) ) 
 *              �� ���� �����尡 ���ÿ� ����Ͽ� �߻��� �� �ִ� 
 *              ������ �����ش� 
 *   step11 
 *   			�����ڿ��� �����ϴ� �޼��� (or �ڵ念��)�� 
 *   			���� ������ ȯ������ ����� synchronized ó���� �Ѵ�            
 */
class Toilet implements Runnable{
	private  boolean seat;// ����Ʈ �ʱ�ȭ false
	@Override
	public void run() {
		try {
			use(Thread.currentThread().getName());
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	}
	// synchronized ó���� �ش� �޼���� ���������� 
	// Thread�� ����ǵ��� ó���Ѵ� (���Ͻ�����ȯ������ ����)
	public synchronized void use(String user) throws InterruptedException{
		if(seat==false){
		Thread.sleep(1000);
		System.out.println(user+" ����");
		Thread.sleep(1000);
		seat=true;
		System.out.println(user+" ���");
		Thread.sleep(2000);
		seat=false;
		System.out.println(user+" ����");
		}else{
			System.out.println(user+"�� ���� ȭ��� ������̹Ƿ� ���Ұ�~");
		}
	}
}
public class TestSynchronized3 {
	public static void main(String[] args) throws InterruptedException {
		Toilet t=new Toilet(); // ���� ��ü 
		Thread userThread1=new Thread(t,"ȣ��ι���");
		Thread userThread2=new Thread(t,"���ͺι���");
		Thread userThread3=new Thread(t,"���Ϲ�������");
		userThread1.start();
		userThread2.start();
		userThread3.start();
	}
}

















