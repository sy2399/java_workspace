package step11;

public class TestArray4 {
	public static void main(String[] args) {
		// �迭 ��� �� �ּҰ��� ���ϱ� 
		int point[]={30,50,10,20,100};
		int minPoint=Integer.MAX_VALUE;//�������� �ִ밪
		for(int i=0;i<point.length;i++){
			System.out.println(minPoint+" "+point[i]);
			if(minPoint>point[i]){
				minPoint=point[i];
			}
		}
		System.out.println("�迭 ��� �ּҰ�:"+minPoint);
	}
}







