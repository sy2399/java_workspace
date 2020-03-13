package step11;

public class TestArray4 {
	public static void main(String[] args) {
		// 배열 요소 중 최소값을 구하기 
		int point[]={30,50,10,20,100};
		int minPoint=Integer.MAX_VALUE;//정수형의 최대값
		for(int i=0;i<point.length;i++){
			System.out.println(minPoint+" "+point[i]);
			if(minPoint>point[i]){
				minPoint=point[i];
			}
		}
		System.out.println("배열 요소 최소값:"+minPoint);
	}
}







