package step3;

public class ItemService {
	public void printAll(ItemVO[] items) {
		for(int i=0;i<items.length;i++)
			System.out.println(
					items[i].getModel()+" "+items[i].getPrice());
	}

	public void printModelByPrice(ItemVO[] items, int price) {
		for(int i=0;i<items.length;i++){
			if(items[i].getPrice()==price){
				System.out.println(items[i].getModel());
				break;
			}//if
		}//for
	}//method

	public void printMaxPrice(ItemVO[] items) {
		int maxPrice=Integer.MIN_VALUE;
		for(int i=0;i<items.length;i++){
			if(maxPrice<items[i].getPrice()){
				maxPrice=items[i].getPrice();
			}
		}
		System.out.println(maxPrice);
	}
}//class









