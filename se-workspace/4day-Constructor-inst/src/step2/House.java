package step2;

public class House {
	private String address;//instance variable 
	private int price;
	public void setAddress(String address){//local variable
		//this keyword를 이용해 instance variable를 가르킨다 
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
}













