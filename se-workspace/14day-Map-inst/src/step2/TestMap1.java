package step2;

import java.util.HashMap;

public class TestMap1 {
	public static void main(String[] args) {
		/*HashMap map=new HashMap();
		//key value ������ �����Ѵ� 
		map.put("1", new Person("������",24));
		map.put("2", new Person("�����",30));
		// key�� 2�� ����� �̸��� ��ȯ�޾� ����غ��� 
		// Generic�� �������� �ʾ����Ƿ� �ֻ��� Ŭ���� Ÿ���� Object ������
		//��ȯ�ȴ�. getName() �� ȣ���ϱ� ���ؼ��� Object Casting�� �ʿ��ϴ�
		Person p=(Person)map.get("2");
		System.out.println(p.getName());*/
		////////Generic ���� Map/////////
		HashMap<String,Person> genericMap
				=new HashMap<String,Person>();
		genericMap.put("a",new Person("�⼺��",30));
		// a key�� �̸��� ��ȯ�޾� ��� 
		System.out.println(genericMap.get("a").getName());
		// ������ a key ��  �ٽ� put �غ��� 
		// ������ key �� put �� ������ value�� ������Ʈ�ȴ� 
		genericMap.put("a",new Person("�����",26));
		System.out.println(genericMap.get("a").getName());
		System.out.println(genericMap);
		genericMap.put("b", new Person("�޽�",30));
		boolean flag=genericMap.containsKey("bb");
		System.out.println("key�� ��������:"+flag);
		//a key ��Ҹ� ���� 
		System.out.println(genericMap.remove("a")+" ����");
		System.out.println(genericMap);
	}
}









