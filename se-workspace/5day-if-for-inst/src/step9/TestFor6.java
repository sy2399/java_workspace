package step9;

public class TestFor6 {
	/*	2*1=2             2*9=18
	 *  ....
	 *  					9*9=81
	 */
	public static void main(String[] args) {
		for(int i=2;i<=9;i++){
			for(int j=1;j<=9;j++){
				System.out.print(i+"*"+j+"="+i*j+" \t ");			
			}
			System.out.println();
		}
	}
}





