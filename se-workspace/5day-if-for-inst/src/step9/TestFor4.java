package step9;

public class TestFor4 {
	public static void main(String[] args) {
		LoopService service=new LoopService();
		String item="����";
		int count=100;
		int limit=0;
		service.printInfoLimit(item,count,limit);
		/*	���� 1��
		 *  ���� 2�� 
		 *  ---------
		 *  ���� limit 0�̸� 
		 *  ���� 1��
		 *  .....
		 *  ���� 100�� 
		 */
	}
}






