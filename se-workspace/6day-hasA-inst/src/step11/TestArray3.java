package step11;

public class TestArray3 {
	public static void main(String[] args) {
		//�迭 ���� ���� �Ҵ� ���ÿ� 
		int [] point={200,300,100,400,600};
		int total=0;
		for(int i=0;i<point.length;i++){
			total+=point[i];
		}
		int avg=total/point.length;
		System.out.println("��� ����Ʈ:"+avg);
	}
}







