package step2;

import java.util.ArrayList;

public class TestList2 {
	public static void main(String[] args) {
		/*ArrayList list=new ArrayList();
		list.add(new Person("장기혁",30));
		// list 의 첫번째 요소의 나이를 출력 
		// Object type으로 반환되므로 Object casting해야 
		//getAge()를 호출할 수 있다. 
		Person p=(Person)list.get(0);
		System.out.println(p.getAge());
		list.add(new Person("정현지",26));
		list.add(new Person("배서경",24));
		// for 문을 이용해서 list의 모든 요소의 name을 출력 
		for(int i=0;i<list.size();i++){
			//System.out.println(((Person) list.get(i)).getName());
			//위 라인을 풀어서 쓴다면 
			Person per=(Person)list.get(i);
			System.out.println(per.getName());
		}*/
		//위 코드를 Generic을 적용하면 아래와 같다 
		ArrayList<Person> genericList=new ArrayList<Person>();
		genericList.add(new Person("아이유",24));
		genericList.add(new Person("장기하",30));
		//첫번째 요소의 이름을 반환받아 출력 
		//( Generic 적용했으므로 별도의 캐스팅 절차 필요없다 ) 
		System.out.println(genericList.get(0).getName());
		genericList.add(new Person("하현우",32));
		//for문을 이용해 30세 이상 Person의 name을 출력 
		for(int i=0;i<genericList.size();i++){
			if(genericList.get(i).getAge()>=30){
				System.out.println(genericList.get(i).getName());
			}
		}
	}
}

















