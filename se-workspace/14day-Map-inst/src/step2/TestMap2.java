package step2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestMap2 {
	public static void main(String[] args) {
		LinkedHashMap<String, ProductVO> map
			=new LinkedHashMap<String,ProductVO>();
		ProductVO vo1=new ProductVO("������7","����",120);
		ProductVO vo2=new ProductVO("������8","�Ｚ",140);
		map.put("1", vo1);
		map.put("2", vo2);
		System.out.println(map);
		System.out.println(map.get("2").getName());
		// map�� key���� ����,��� 
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		// map�� value ���� ��ȯ�޾� ��ǰ name�� ���� 
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









