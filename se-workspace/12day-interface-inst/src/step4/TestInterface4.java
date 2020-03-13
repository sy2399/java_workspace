package step4;

public class TestInterface4 {
	public static void main(String[] args) {
		PlayerService service=new PlayerService(10);
		service.addPlayer(new GomPlayer());
		service.addPlayer(new AlSongPlayer());
		service.addPlayer(new CDPlayer());
		service.executeAll();
	}
}





