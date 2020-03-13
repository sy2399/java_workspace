package step2;

public class TestVariableScope {
	// instance variable : heap ���� ���� , �⺻ �ʱ�ȭ 0
	private int i; 
	public void test1(){
		int j; // local variable 
		System.out.println(i); // �⺻�ʱ�ȭ�Ǿ� 0 ��� 
		//System.out.println(j); //error, j�� ���������̹Ƿ� �ʱ�ȭ �ʿ� 
		int k=0; //���������� ����� �ʱ�ȭ�ؾ� ��밡�� 
		System.out.println(k);
	}
	public void test2(int i){
		System.out.println(i); // �������� i 
		System.out.println(this.i);// instance ���� 
		int j=2;
	}
	public void test3(){
		System.out.println(i); // instance v �̹Ƿ� ��밡�� 
	//	System.out.println(j); //���������̹Ƿ� test2() �������� ��밡��
	}
	public void test4(){
		if(i<=0){
			int k=5;
		}
	//	System.out.println(k); //error �������� k �� 
	// ����� �ڽ��� ���࿵�� �������� ��밡���ϴ� 
	// test5() ���� �ڵ带 �����غ��� 	
	}
	public void test5(){
		int k=0;
		if(i<=0){
			k=5;
		}
		System.out.println(k);
	}
	public static void main(String[] args) {
		//���θ޼���� static �̹Ƿ� ���� Ŭ������ �޼���� 
		//��ü�� �����ؼ� ȣ���ؾ� �Ѵ� ( static�� �����ֿ� ���ο��� )
		TestVariableScope t=new TestVariableScope();
		t.test1();
		t.test2(5);
	}
}










