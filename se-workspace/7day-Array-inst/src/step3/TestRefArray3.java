package step3;

public class TestRefArray3 {
	public static void main(String[] args) {
		ItemVO[] items
		={new ItemVO("������7",90),
			 new ItemVO("G6",120),
				new ItemVO("������7",140)};
		ItemService service=new ItemService();
		service.printAll(items);
		//price�� 120 �� �������� model �� ��� 
		service.printModelByPrice(items,120);
		// items �迭 ��� �� �ְ��� ����Ѵ� 
		service.printMaxPrice(items);//140
	}
}








