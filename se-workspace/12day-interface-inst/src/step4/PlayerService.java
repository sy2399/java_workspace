package step4;

public class PlayerService {
	private Player list[];
	private int index;
	public PlayerService(int length) {
		list=new Player[length];
	}
	public void addPlayer(Player player) {
		list[index++]=player;
	}
	public void executeAll() {
		for(int i=0;i<index;i++){
			if(list[i] instanceof CDPlayer)
				((CDPlayer) list[i]).insertCD();
			list[i].play();
		}		
	}		
}
