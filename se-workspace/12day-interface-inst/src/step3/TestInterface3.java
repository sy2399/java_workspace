package step3;

import step2.Airplane;
import step2.Bird;
import step2.Eagle;
import step2.Helicopter;
import step2.SuperMan;

public class TestInterface3 {
	public static void main(String[] args) {		
		FlyerService service=new FlyerService(10);
		service.addFlyer(new Airplane());
		service.addFlyer(new Helicopter());
		service.addFlyer(new Bird());
		service.addFlyer(new Eagle());
		service.addFlyer(new SuperMan());
		service.addFlyer(new IronMan());
		//service.executeFlyerAll();
		service.executeFighterAll();
	}
}










