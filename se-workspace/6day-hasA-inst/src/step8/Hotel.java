package step8;

public class Hotel {
	private String name;
	private SweetRoom sweetRoom;
	public Hotel(String name, SweetRoom sweetRoom) {		
		this.name = name;
		this.sweetRoom = sweetRoom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SweetRoom getSweetRoom() {
		return sweetRoom;
	}
	public void setSweetRoom(SweetRoom sweetRoom) {
		this.sweetRoom = sweetRoom;
	}
	
}
