package step2;

import java.util.HashMap;

public class TestMap1 {
	public static void main(String[] args) {
		/*HashMap map=new HashMap();
		//key value 쌍으로 저장한다 
		map.put("1", new Person("아이유",24));
		map.put("2", new Person("장기하",30));
		// key가 2인 사람의 이름을 반환받아 출력해본다 
		// Generic을 적용하지 않았으므로 최상위 클래스 타입인 Object 형으로
		//반환된다. getName() 을 호출하기 위해서는 Object Casting이 필요하다
		Person p=(Person)map.get("2");
		System.out.println(p.getName());*/
		////////Generic 적용 Map/////////
		HashMap<String,Person> genericMap
				=new HashMap<String,Person>();
		genericMap.put("a",new Person("기성용",30));
		// a key의 이름을 반환받아 출력 
		System.out.println(genericMap.get("a").getName());
		// 동일한 a key 로  다시 put 해본다 
		// 동일한 key 로 put 될 때에는 value가 업데이트된다 
		genericMap.put("a",new Person("손흥민",26));
		System.out.println(genericMap.get("a").getName());
		System.out.println(genericMap);
		genericMap.put("b", new Person("메시",30));
		boolean flag=genericMap.containsKey("bb");
		System.out.println("key의 존재유무:"+flag);
		//a key 요소를 삭제 
		System.out.println(genericMap.remove("a")+" 삭제");
		System.out.println(genericMap);
	}
}









