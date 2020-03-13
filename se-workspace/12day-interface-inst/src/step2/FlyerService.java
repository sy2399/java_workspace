package step2;

public class FlyerService {
	public void execute(Flyer[] fa) {
		for(int i=0;i<fa.length;i++){		
			if(fa[i]==null)
				break;
			fa[i].fly();
		}
	}
}
