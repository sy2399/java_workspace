package step3;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		Random r=new Random();
		//임의의 수를 발생 
	/*	for(int i=0;i<100;i++)
		System.out.println(r.nextInt(2));//0~1 
*/		System.out.println("************");
		for(int i=0;i<100;i++)
			System.out.println(r.nextInt(5));//0~4
	}
}











