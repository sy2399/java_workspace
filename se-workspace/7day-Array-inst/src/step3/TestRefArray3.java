package step3;

public class TestRefArray3 {
	public static void main(String[] args) {
		ItemVO[] items
		={new ItemVO("갤럭시7",90),
			 new ItemVO("G6",120),
				new ItemVO("아이폰7",140)};
		ItemService service=new ItemService();
		service.printAll(items);
		//price가 120 인 아이템의 model 을 출력 
		service.printModelByPrice(items,120);
		// items 배열 요소 중 최고가를 출력한다 
		service.printMaxPrice(items);//140
	}
}








