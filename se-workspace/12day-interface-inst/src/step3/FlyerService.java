package step3;

import step2.Fighter;
import step2.Flyer;

public class FlyerService {
	private Flyer[] list;
	private int index;
	public FlyerService(int length) {
		list=new Flyer[length];
	}
	public void addFlyer(Flyer f) {
		list[index++]=f;
	}
	public void executeFlyerAll() {
		for(int i=0;i<index;i++)
			list[i].fly();
	}
	public void executeFighterAll() {
		for(int i=0;i<index;i++){
			if(list[i] instanceof Fighter){
				((Fighter) list[i]).fight();		
			}
		}
	}	
}







