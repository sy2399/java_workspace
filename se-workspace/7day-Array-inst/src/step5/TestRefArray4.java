package step5;

public class TestRefArray4 {
	public static void main(String[] args) {
		ProductVO[] pa=new ProductVO[3];
		pa[0]=new ProductVO("������7", "����", 120);
		pa[1]=new ProductVO("������4", "�Ｚ", 20);
		pa[2]=new ProductVO("������5", "����", 60);
		ProductService service=new ProductService();
		ProductVO vo=
				service.findProductVOByName(pa,"������5");
		if(vo!=null)
			System.out.println(vo.getName()+" "+vo.getPrice());
		else
			System.out.println("���� ����!");
		System.out.println("****************************");
		ProductVO[] reList=
				service.findProductListByMaker(pa,"����");
		for(int i=0;i<reList.length;i++)
			System.out.println(reList[i].getName()
										+" "+reList[i].getPrice());
	}
}







