package step9;

public class TestFor4 {
	public static void main(String[] args) {
		LoopService service=new LoopService();
		String item="持呼";
		int count=100;
		int limit=0;
		service.printInfoLimit(item,count,limit);
		/*	持呼 1接
		 *  持呼 2接 
		 *  ---------
		 *  幻鉦 limit 0戚檎 
		 *  持呼 1接
		 *  .....
		 *  持呼 100接 
		 */
	}
}






