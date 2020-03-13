package step3;
// VO : Value Object , DTO : Data Transfer Object 
// DAO : Data Access Object , Service : business logic 
public class ItemVO {
	private String model;
	private int price;
	public ItemVO(String model,int price){
		this.model=model;
		this.price=price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
