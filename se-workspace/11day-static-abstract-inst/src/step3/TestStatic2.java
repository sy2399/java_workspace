package step3;
class Person{
	int money=100;
	static int sMoney=200;
	public void test1(){// object�� member �޼��� 
		System.out.println(money);
		System.out.println(sMoney);
		test2();
		test3();
	}
	public static void test2(){
		System.out.println(sMoney);
		//�̿��ϱ� ���ؼ��� ��ü ������ �ʿ��ϴ�
		//test2�� static �޼����̹Ƿ� ��ü �������� �ܺο��� 
		//Ŭ���������� ���డ���ϰ� �����Ϸ��� �ϴ� money�� 
		//�ν��Ͻ������̹Ƿ� �ݵ�� ��ü������ ����ؾ� 
		//money�� �޸𸮿� ����ȴٴ� ������ �Ҽ� �ֱ� �����̴� 
		//System.out.println(money);
		//test3(); // ���� ������ error 
		test4();
	}
	public void test3(){}
	public static void test4(){}
}
public class TestStatic2 {
	
}





