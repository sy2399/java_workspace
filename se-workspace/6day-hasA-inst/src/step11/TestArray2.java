package step11;

public class TestArray2 {
	public static void main(String[] args) {
		int [] salary=new int[4];
		salary[0]=100; 
		salary[1]=300;
		salary[2]=500;
		salary[3]=700;
		int total=0;
		for(int i=0;i<salary.length;i++){
			total+=salary[i];
		}
		System.out.println("ÃÑÀÓ±Ý:"+total);
	}
}








