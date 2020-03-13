package step1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TestIterator {
	public static void main(String[] args) {
		//ArrayList<String> list=new ArrayList<String>();
		Collection<String> list=new ArrayList<String>();
		list.add("피자");
		list.add("짜장면");
		list.add("짬뽕");
		Iterator<String> it=list.iterator();
		while(it.hasNext()){// 다음 요소가 존재하면 true 존재하지 않으면 false
			System.out.println(it.next());//다음 요소를 반환 
		}
		System.out.println("************************");
		Collection<String> set=new TreeSet<String>();
		set.add("민정수석");
		set.add("민정수석");
		set.add("정무수석");
		set.add("홍보수석");
		Iterator<String> it2=set.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
		/*	  ArrayList , TreeSet 과 같은 Collection 인터페이스의 하위 구현체는
		 *   Collection 인터페이스의 iterator() 추상 메서드를 구현했기 때문에
		 *   iterator() 메서드 호출 후 반환되는 Iterator 로 
		 *   Set 이든 List 든 관계없이 
		 *   표준화된 방식으로 요소들을 반복 열거 할 수 있다 
		 * 
		 */
	}
}

















