package step5;

import java.util.ArrayList;
// 3�� 10�� Ǯ�� 
public class TestShoppingCart {
	public static void main(String[] args) {
		CartService service=new CartService();
		service.addProduct(new ProductVO("���̽�","����",1200));
		service.addProduct(new ProductVO("ó��ó��","�Ե�",1200));
		service.addProduct(new ProductVO("���̽�","����",1200));
		service.printAllName();
		/*  ���̽�
		 *  ó��ó��
		 *  ���̽� 
		 */
		System.out.println("*******************");
		ArrayList<ProductVO> reList
				=service.findProductByMaker("����");
		for(int i=0;i<reList.size();i++)
			System.out.println(reList.get(i).getName());/**/
		/* ���̽� 
		 * ���̽� 
		 */
		
	}
}












