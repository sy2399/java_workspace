package step4;
/* ä�� Ŭ���̾�Ʈ 
 *  ���� �޼����� ������ ��� ( ��½����� )  
 *  ģ������ �޼����� �Է� ( �Է½����� ) 
 */
class InputWorker implements Runnable{
	public void run(){
		for(int i=0;i<10;i++)
			System.out.println("�Է½����� ���� "+i);
	}
}
class OutputWorker implements Runnable{
	public void run(){
		for(int i=0;i<10;i++)
			System.out.println("��½����� ���� "+i);
	}
}
public class TestThread4 {
	public static void main(String[] args) {
		// InputWorker Thread �� OutputWorker Thread ���� �� start()
		Thread inputThread=new Thread(new InputWorker());
		inputThread.start();
		Thread outputThread=new Thread(new OutputWorker());
		outputThread.start();
		System.out.println("���ν����� ����");
	}
}









