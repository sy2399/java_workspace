package step2;

public class TestRefArray1 {
	public static void main(String[] args) {
		Person[] pa=new Person[3];
		System.out.println(pa[0]);
		pa[0]=new Person("������",24);
		pa[1]=new Person("������",30);
		pa[2]=new Person("������",32);
		// pa �迭 ����� �̸��� ��� ����ϼ��� 
		for(int i=0;i<pa.length;i++)
			System.out.println(pa[i].getName());
		System.out.println("=============");
		// pa �迭 ��� �� 25�� �̻��� ȸ���̸� ���� ���
		for(int i=0;i<pa.length;i++){
			if(pa[i].getAge()>=25){
				System.out.println(pa[i].getName()+" "+pa[i].getAge());
			}
		}
	}
}









