package step2;

public class TestRefArray2 {
	public static void main(String[] args) {
		Person[] pa={new Person("����",20),
				new Person("������",32),new Person("���켺",30)};
		//�迭 ����� ���̸� +10 ó�� 
		//for
		for(int i=0;i<pa.length;i++){
			pa[i].setAge(pa[i].getAge()+10);
		}			
		// �迭 ��� ���� �̸� ��� 
		for(int i=0;i<pa.length;i++)
			System.out.println(pa[i].getName()+" "+pa[i].getAge());		
	}
}




