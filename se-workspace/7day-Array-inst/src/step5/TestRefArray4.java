package step5;

public class TestRefArray4 {
	public static void main(String[] args) {
		ProductVO[] pa=new ProductVO[3];
		pa[0]=new ProductVO("아이폰7", "애플", 120);
		pa[1]=new ProductVO("갤럭시4", "삼성", 20);
		pa[2]=new ProductVO("아이폰5", "애플", 60);
		ProductService service=new ProductService();
		ProductVO vo=
				service.findProductVOByName(pa,"갤럭시5");
		if(vo!=null)
			System.out.println(vo.getName()+" "+vo.getPrice());
		else
			System.out.println("정보 없음!");
		System.out.println("****************************");
		ProductVO[] reList=
				service.findProductListByMaker(pa,"애플");
		for(int i=0;i<reList.length;i++)
			System.out.println(reList[i].getName()
										+" "+reList[i].getPrice());
	}
}







