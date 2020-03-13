package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*	메뉴 입력
 *  탕수육 <- 입력
 *  탕수육 주문처리 
 *  피자 <- 입력 
 *  피자 주문처리 
 *  주문끝 
 *   System.in < InputStreamReader < BufferedReader 를 이용해 위와 같이 구현
 */
public class TestIOReview3 {
	public static void main(String[] args) {
		BufferedReader br
			=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("메뉴 입력");
			while(true){
				String order=br.readLine();
				if(order.equals("주문끝"))
					break;
				System.out.println(order+" 주문처리");
			}
			br.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}









