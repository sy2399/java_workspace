package school;

import java.util.ArrayList;
import java.util.Iterator;

public class SchoolService {
	private ArrayList<Person> list=new ArrayList<Person>();
	/*
	 *  tel �� �ش��ϴ� list ���(������)�� �ε����� ��ȯ�ϴ� �޼��� 
	 *  ���� tel �� �ش��ϴ� ��Ұ� ���� ��� -1 �� ��ȯ 
	 *  �߰�,�˻�,����,���� �޼����� 
	 *  ���� ����� ������ �޼��忡�� ó���غ��� 
	 */
	public int findIndexByTel(String tel){
		int index=-1;
		for(int i=0;i<list.size();i++){
			if(tel.equals(list.get(i).getTel())){
				index=i;
				break;
			}
		}
		return index;
	}
	public void addPerson(Person p) throws DuplicateTelException{
		if(findIndexByTel(p.getTel())!=-1)
			throw new DuplicateTelException(p.getTel()
					+" tel�� �����Ͽ� �߰��Ұ�!");
		list.add(p);
	}
	public void printAll(){
		Iterator<Person> it=list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public Person findPersonByTel(String tel) throws PersonNotFoundException{
		int index=findIndexByTel(tel);
		if(index==-1)
			throw new PersonNotFoundException(tel+" tel�� �������� �ʾ� ��ȸ�� �� �����ϴ�.!");
		return list.get(index);
	}
	public void updatePerson(Person p) throws PersonNotFoundException{
		int index=findIndexByTel(p.getTel());
		if(index==-1)
			throw new PersonNotFoundException(p.getTel()+" tel�� �������� �ʾ� ������ �� �����ϴ�.!");
		list.set(index, p);
	}
	public void deletePersonByTel(String tel) throws PersonNotFoundException{
		int index=findIndexByTel(tel);
		if(index==-1)
			throw new PersonNotFoundException(tel+" tel�� �������� �ʾ� ������ �� �����ϴ�.!");
		list.remove(index);
	}
}

































