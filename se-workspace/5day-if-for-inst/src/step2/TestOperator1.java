package step2;

public class TestOperator1 {
	public static void main(String[] args) {
		int i=7;
		int j=3;
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);//���� ������ 
		System.out.println(i==j);//���� ������ ���Ͽ� true false 
		System.out.println(i!=j);//���� ������ true 
		System.out.println("************");
		boolean flag=false;
		System.out.println(flag);
		System.out.println(!flag);
		System.out.println("************");
		int k=7;
		System.out.println(k++);//���� �� ���� 
		System.out.println(k);
		System.out.println(++k);//���� �� ���� 
		System.out.println(k);
		System.out.println("************");
		System.out.println(--k);
		System.out.println(k--);
		System.out.println(k);
		System.out.println("************");
		int balance=100;
		//balance=balance+200;
		//�� �ڵ带 �ٿ��� ǥ���ϸ� 
		balance+=200;
		System.out.println(balance);
		System.out.println("************");
		/*
		 * 		&  ��   |   �����   && �� || ������ ����� ������ 
		 *     ���ɿ��� ���̰� �ִ� 
		 * 
		 *     and ���� 
		 *    true  &  true  -> true  
		 *    true  &  false -> false 
		 *    false &  true ->  false
		 *    false &  false -> false 
		 *    
		 *    && �����ڸ� �̿��ϸ� and ������ ��� 
		 *    false �� ó�� ����Ǹ� ���� ������ �����ϰ� 
		 *    ����� ���� ( ���� ��� ) 
		 *    
		 *    or ���� 
		 *    true  |  true  -> true  
		 *    true  |  false -> true 
		 *    false |  true ->  true
		 *    false |  false -> false    
		 *    
		 *    || �����ڸ� �̿��ϸ� �������ǰ���� true�̸� 
		 *    ���� ���� �������� �ʰ� �ٷ� true�� ����� ���� 
		 */
		System.out.println(true||false);
		System.out.println(true&&false);
		System.out.println("****************");
		// ���� ������ 
		int x=10;
		//           (���ǽ�)?��1:��2
		//           ���ǽ��� ���̸� ��1 ���� , �����̸� ��2 ���� 
		int result=(x<0)?x+1:x+2;
		System.out.println(result);
	}
}









