//��Ű�� �����Ͽ� step1 ���丮 �Ʒ���
//TestPerson class �����ϰ� �Ѵ�
package step1;
/* TestPerson class�� Person class�� �̿��� 
 * ��ü �����ϰ� �Ӽ��� �����͸� �Ҵ��غ��� 
 * Person ��ü�� ����� �����غ��� ������ �Ѵ� 
 * Person class : Person ��ü�� �����ϱ� ���� Ʋ 
 * TestPerson class : main method�� ����Ͽ� 
 * ���α׷��� ������ �����ϰ� �ϰ� 
 * �ٸ� Ŭ������ �̿��� ��ü ���� �� ��� �׽�Ʈ�Ѵ� 
 */
public class TestPerson {
	/*
	 * ���� �޼���� �ڹ� ���α׷��� ������ 
	 */
	public static void main(String[] args) {
		/* Person class�� �̿��� ��ü �����Ѵ� 
		 * Person : ������ Ÿ�� ( ������ ������ Ÿ�� )
		 * p : ������ (��������)
		 * = : �Ҵ� or ���� 
		 * new : ��ü ������ ����ϴ� �ڹ� Ű���� 
		 * Person() : ������ ( constructor ) 
		 */
		Person p=new Person();
		p.name="������";//����(�Ӽ�)�� �̸������Ѵ� 
		System.out.println(p.name);//������ �̸� ��� 
		//��ü ������ �ѹ� �� �غ��� 
		Person p2=new Person();
		//p2 ��ü�� name�� ����ϸ� �Ҵ��Ѵ� 
		p2.name="�����";
		//p2 ��ü�� name�� ����غ��� 
		System.out.println(p2.name);
		// p �� p2 ��ü�� study �޼��带 ȣ���غ��� 
		p.study();
		p2.study();		
	}
}








