package step1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class DeliveryService{
	public Collection<String> getCollection(String type){
		Collection<String> col=null;
		if(type.equals("����")){
			col=new ArrayList<String>();
			col.add("���̽�"); col.add("ó��ó��");
			col.add("�鼼��");
		}else if(type.equals("����")){
			col=new LinkedHashSet<String>();
			col.add("Ŭ����");col.add("ī��");col.add("��׽�");
		}
		return col;
	}
}
public class TestIterator2 {
	public static void main(String[] args) {
		DeliveryService service=new DeliveryService();
		Collection<String> c=service.getCollection("����");
		if(c instanceof List)
			System.out.println("List ����ü");
		else if(c instanceof Set)
			System.out.println("Set ����ü");
		// Set �迭�̵� List �迭�̵� ������� ǥ��ȭ�� �������
		//��ҵ��� �ݺ� ������ �� �ִ� 
		Iterator<String> it=c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}











