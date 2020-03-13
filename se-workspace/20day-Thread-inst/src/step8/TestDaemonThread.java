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
			System.out.println("����۾�");
		}
	}
}
class NotePad extends Thread{
	@Override
	public void run() {
		/*
		 * �����۾����۽� ��������带 start ��Ų�� 
		 * ������ �غ��� ���� �۾� ���� �Ŀ��� 
		 * ��� ���������� ������ ���ӵȴ� 
		 * ���� �۾� ����Ǹ� ��������嵵 ���� ����ǵ���
		 * Thread�� setDaemon(true)�� �����Ѵ� 
		 */
		BackUpWorker backup=new BackUpWorker();
		//�ڽ��� start ��Ų ������(NotePad)�� ����Ǹ� 
		//�Բ� ����ǵ��� ���� 
		backup.setDaemon(true);
		backup.start();
		for(int i=0;i<10;i++){
			System.out.println("�����۾� "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
		System.out.println("���� �۾� ����");
	}
}
public class TestDaemonThread {
	public static void main(String[] args) {
		new NotePad().start();		
	}
}







