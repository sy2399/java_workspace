package step5;

public class Person {
	private String name;
	public Person(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void tour() {
		// ��Ʈī�� �̿��Ѵ� : use a ���� 
		RentCar rc=new RentCar("�ҳ�Ÿ",10);
		System.out.println(
			rc.getModel()+" Ÿ�� "+name+" �����ϴ�");
		//�� �޼��尡 ����Ǹ� RentCar ��ü�� 
		//Garbage Collection ����� �ȴ� 
	}
}





