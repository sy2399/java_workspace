package step5;
/* �ϳ��� Ŭ������ �̿��Ͽ� �ټ��� �����带 �����Ͽ� �����ϴ� ���� 
 *  
 * �������� ������ ���񽺸� ���� ( ex - ä�� or �α��� or �˻� )
 *  --> Thread class 1�� ����  
 *  �ټ��� Ŭ���̾�Ʈ�� ���ÿ� �����ϸ� 
 *  ���������� Ŭ���̾�Ʈ�� ���� ���� �����带 �����ؾ� �Ѵ� 
 *  --> Thread ������ Ŭ���̾�Ʈ ����ŭ �����ؾ� �Ѵ� 
 */
class ServerWorker implements Runnable{
	public void run(){
		String name=Thread.currentThread().getName();
		System.out.println("**"+name+"** �켱����:"
								+Thread.currentThread().getPriority());
		for(int i=0;i<10;i++){
			if(name.equals("ù��° �ϲ�")){
				try {
					Thread.sleep(1000);//1�� �������� �ߴ� �� ���� �簳 
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
			}
			System.out.println(name+" ServerWorker Thread ����-�˻�����"+i);
		}
	}
}
public class TestThread5 {
	public static void main(String[] args) {
		ServerWorker sw=new ServerWorker();
		Thread t1=new Thread(sw,"ù��° �ϲ�");
		Thread t2=new Thread(sw,"�ι�° �ϲ�");	
		t1.start(); t2.start();
		System.out.println("main thread ����");
	}
}







