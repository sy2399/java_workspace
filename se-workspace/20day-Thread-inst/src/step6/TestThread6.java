package step6;
/*
 * ������ �켱���� �����ٸ��� ���� �׽�Ʈ 
 */
class Worker extends Thread{
	@Override
	public void run() {
		for(long i=0;i<9000000000L;i++){}
		System.out.println(getName()
				+" ������ ����Ϸ�.. �켱����:"+getPriority());
	}
}
public class TestThread6 {
	public static void main(String[] args) {
	/*	Worker t1=new Worker();
		t1.setName("ù��° �ϲ�");
		Worker t2=new Worker();
		t2.setName("�ι�° �ϲ�");
		t1.start(); t2.start();
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);*/
		/*
		 *  ������ �켱���� �׽�Ʈ�� ���� 
		 *  Worker Thread 20�� �����ϰ�
		 *  ������ �����忡 �̸��� ���� ( 0��° ������ ) �ϰ� 
		 *  10�� �ε����� �ش��ϴ� ������ �ϳ��� setPriority(10)
		 *  ������ 19���� setPriority(1);
		 *  ���� start() 
		 */
		for(int i=0;i<20;i++){
			Worker w=new Worker();
			w.setName(i+"��° ");
			if(i==10)
				w.setPriority(Thread.MAX_PRIORITY);
			else
				w.setPriority(Thread.MIN_PRIORITY);
			w.start();
		}
	}
}
















