package step5;

import java.util.ArrayList;
// 3시 10분 풀이 
public class TestShoppingCart {
	public static void main(String[] args) {
		CartService service=new CartService();
		service.addProduct(new ProductVO("참이슬","진로",1200));
		service.addProduct(new ProductVO("처음처럼","롯데",1200));
		service.addProduct(new ProductVO("참이슬","진로",1200));
		service.printAllName();
		/*  참이슬
		 *  처음처럼
		 *  참이슬 
		 */
		System.out.println("*******************");
		ArrayList<ProductVO> reList
				=service.findProductByMaker("진로");
		for(int i=0;i<reList.size();i++)
			System.out.println(reList.get(i).getName());/**/
		/* 참이슬 
		 * 참이슬 
		 */
		
	}
}












