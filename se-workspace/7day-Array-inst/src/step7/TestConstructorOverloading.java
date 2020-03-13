package step7;
class Car{
	private String model;
	private int price;
	private String color;
	Car(){}
	//생성자 오버로딩 : 다양한 옵션으로 객체를 생성할 수 있게 한다 
	Car(String model){
		this.model=model;
	}
	Car(String model,int price){
		this.model=model;
		this.price=price;
	}
	Car(String model,int price,String color){
		this(model,price);
		this.color=color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
public class TestConstructorOverloading {
	public static void main(String[] args) {
		//아래와 같이 다양한 옵션으로 객체 생성을 할 수 있다 
		/*Car c1=new Car();
		Car c2=new Car("모닝");
		Car c3=new Car("스파크",100);*/
	}
}







