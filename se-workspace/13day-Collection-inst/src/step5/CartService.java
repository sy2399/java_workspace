package step5;

import java.util.ArrayList;

public class CartService {
	private ArrayList<ProductVO> list=new ArrayList<ProductVO>();
	public void addProduct(ProductVO productVO) {		
		list.add(productVO);
	}
	public void printAllName() {
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i).getName());
	}
	public ArrayList<ProductVO> findProductByMaker(String maker) {
		ArrayList<ProductVO> reList=new ArrayList<ProductVO>();
		for(int i=0;i<list.size();i++){
			if(maker.equals(list.get(i).getMaker())){
				reList.add(list.get(i));
			}
		}
		return reList;
	}
}







