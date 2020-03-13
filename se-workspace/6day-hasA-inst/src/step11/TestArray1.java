package step11;

public class TestArray1 {
	public static void main(String[] args) {
		int[] ages; 
		ages=new int[3]; // length 3  배열 객체 생성 
		System.out.println(ages.length);
		ages[0]=10; 
		ages[1]=30;
		ages[2]=20;
		//System.out.println(ages[3]); // exception 발생 
		//System.out.println(ages[1]);
		// length 를 이용해 for문으로 모든 요소를 출력해본다 
		for(int i=0;i<ages.length;i++){
			System.out.println(ages[i]);
		}
	}
}














