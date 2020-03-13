package step5;

public class Account {
	//private 접근제어자로 외부접근차단 	
	private int money;
	private String name;
	//public  setter/getter로 간접접근하게 한다 
	//setter method: 외부에서 정보를 할당할때 사용한다 
	public void setMoney(int m){	
		money=m;
	}
	//getter method : 외부로 정보를 리턴할때 사용 
	public int getMoney(){
		return money;
	}
	public void setName(String n){
		name=n;
	}
	public String getName(){
		return name;
	}
}

















