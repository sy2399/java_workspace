package school;

import java.util.ArrayList;

public class SchoolService {
	private ArrayList<Person> list=new ArrayList<Person>();
	public void addPerson(Person p) {		
		boolean flag=false;
		for(int i=0;i<list.size();i++){
			if(p.getTel().equals(list.get(i).getTel())){
				flag=true;
				break;
			}
		}
		if(!flag)		
			list.add(p);
		else
			System.out.println(p.getTel()+"��ȣ�� �����Ͽ� �߰� �Ұ�! ");
	}	
	public void printAll(){
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	public Person findPersonByTel(String tel) {
		Person p=null;
		for(int i=0;i<list.size();i++){
			if(tel.equals(list.get(i).getTel())){
				p=list.get(i);
				break;
			}
		}
		return p;
	}
	public void updatePerson(Person p) {
		boolean flag=false;
		for(int i=0;i<list.size();i++){
			if(p.getTel().equals(list.get(i).getTel())){
				list.set(i, p);
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println(p.getTel()+" ��ȣ�� ���� �������� �����Ƿ� �����Ұ�!");
	}
	public void deletePersonByTel(String tel) {
		Person p=null;
		for(int i=0;i<list.size();i++){
			if(tel.equals(list.get(i).getTel())){
				p=list.remove(i);
				break;
			}
		}		
		if(p==null)
			System.out.println(tel+"�� �ش��ϴ� ��� ��� ����x");
		/*else
			System.out.println(p+" �������� ����");*/
	}
}

































