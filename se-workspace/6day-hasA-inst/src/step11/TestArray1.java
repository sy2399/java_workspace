package step11;

public class TestArray1 {
	public static void main(String[] args) {
		int[] ages; 
		ages=new int[3]; // length 3  �迭 ��ü ���� 
		System.out.println(ages.length);
		ages[0]=10; 
		ages[1]=30;
		ages[2]=20;
		//System.out.println(ages[3]); // exception �߻� 
		//System.out.println(ages[1]);
		// length �� �̿��� for������ ��� ��Ҹ� ����غ��� 
		for(int i=0;i<ages.length;i++){
			System.out.println(ages[i]);
		}
	}
}














