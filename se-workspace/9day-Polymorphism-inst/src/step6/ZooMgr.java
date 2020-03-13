package step6;

import step4.Animal;
import step4.Person;

public class ZooMgr {
	public void enter(Animal[] ani) {		
		for(int i=0;i<ani.length;i++){
			if(ani[i] instanceof Person){
				((Person)ani[i]).ticketing();
			}//if
			ani[i].play();
		}//for
	}//method
}//class







