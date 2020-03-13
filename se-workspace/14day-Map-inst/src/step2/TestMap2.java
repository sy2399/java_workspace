package step2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestMap2 {
	public static void main(String[] args) {
		LinkedHashMap<String, ProductVO> map
			=new LinkedHashMap<String,ProductVO>();
		ProductVO vo1=new ProductVO("아이폰7","애플",120);
		ProductVO vo2=new ProductVO("갤럭시8","삼성",140);
		map.put("1", vo1);
		map.put("2", vo2);
		System.out.println(map);
		System.out.println(map.get("2").getName());
		// map의 key들을 열거,출력 
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		// map의 value 들을 반환받아 상품 name만 열거 
		Collection<ProductVO> col=map.values();
		Iterator<ProductVO> it2=col.iterator();
		/*while(it2.hasNext())
			System.out.println(it2.next().getName());*/
		System.out.println(it2.hasNext());
		System.out.println(it2.hasNext());
		System.out.println(it2.hasNext());
		System.out.println(it2.hasNext());
		System.out.println(it2.next());
		System.out.println(it2.next());
		System.out.println(it2.hasNext());
	}
}









