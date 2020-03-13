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
		if(type.equals("소주")){
			col=new ArrayList<String>();
			col.add("참이슬"); col.add("처음처럼");
			col.add("백세주");
		}else if(type.equals("맥주")){
			col=new LinkedHashSet<String>();
			col.add("클라우드");col.add("카스");col.add("기네스");
		}
		return col;
	}
}
public class TestIterator2 {
	public static void main(String[] args) {
		DeliveryService service=new DeliveryService();
		Collection<String> c=service.getCollection("맥주");
		if(c instanceof List)
			System.out.println("List 구현체");
		else if(c instanceof Set)
			System.out.println("Set 구현체");
		// Set 계열이든 List 계열이든 관계없이 표준화된 방법으로
		//요소들을 반복 열거할 수 있다 
		Iterator<String> it=c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}











