package step2;

public class TestCar {
	public static void main(String[] args) {
		// Car ��ü�� c1�̶�� ������ �����Ѵ� 
		Car c1=new Car(); 
		// c1 ��ü�� model ������ sm5�� �����Ѵ� 
		c1.model="sm5";
		// c1 ��ü�� model ���������� ����غ��� 
		System.out.println(c1.model);
		// c1 ��ü�� price ������ 2000�� �����Ѵ� 
		c1.price=2000;
		// c1 ��ü�� price �� ��� 
		System.out.println(c1.price);
		/*
		 *  c2 ������ Car ��ü�� ���� ���� 
		 *  c2 ��ü�� model ������ �ҳ�Ÿ�� �Ҵ� 
		 *  c2 ��ü�� price ������ 2500�� �Ҵ� 
		 *  ����� �ҳ�Ÿ 2500 �� �ǵ��� �ڵ� 
		 */
		Car c2=new Car();
		c2.model="�ҳ�Ÿ";
		c2.price=2500;
		System.out.println(c2.model+" "+c2.price);
	}
}













