package step2;

public class TestInterface2 {
	public static void main(String[] args) {
		Flyer fa[]=new Flyer[10];
		fa[0]=new Bird();
		fa[1]=new Airplane();
		fa[2]=new Helicopter();
		fa[3]=new Eagle();
		fa[5]=new SuperMan();
		FlyerService service=new FlyerService();
		service.execute(fa);
	}
}








