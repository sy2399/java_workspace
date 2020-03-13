package school;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolService {
	private LinkedHashMap<String, Person> map
						=new LinkedHashMap<String,Person>();
	public void addPerson(Person p) {		
		if(map.containsKey(p.getTel())==false)
			map.put(p.getTel(), p);
		else
			System.out.println(p.getTel()+"번호가 존재하여 추가 불가!");
	}
	public void printAll() {		
		Iterator<Person> it=map.values().iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public Person findPersonByTel(String tel) {		
		return map.get(tel);
	}
	public void updatePerson(Person p) {
		if(map.containsKey(p.getTel()))
			map.put(p.getTel(), p);
		else
			System.out.println(p.getTel()+"번호를 가진 구성원이 없으므로 수정불가! ");
	}
	public void deletePersonByTel(String tel) {
		map.remove(tel);
	}
}

































