package step9;
/*
 * ���� ������ ȯ�濡�� �׽�Ʈ 
 * ( ���������� �����ϹǷ� ���� ���� ) 
 */
class Toilet{
	private  boolean seat;// ����Ʈ �ʱ�ȭ false 
	public void use(String user) throws InterruptedException{
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
public class TestSynchronized1 {
	public static void main(String[] args) throws InterruptedException {
		Toilet t=new Toilet();
		t.use("ȣ��ι���");
		t.use("���͹���");
	}
}

















