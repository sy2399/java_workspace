package step7;

public class Engine {
	private String type;
	private int displacement;
	public Engine(String type, int displacement) {		
		this.type = type;
		this.displacement = displacement;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDisplacement() {
		return displacement;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
}
