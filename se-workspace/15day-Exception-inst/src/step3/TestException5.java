package step3;

public class TestException5 {
	// ���� ����� �����غ��� ���� 
	/*  �ϳ��� try ���� catch ���� ������ ���� �� �� �ִ� 
	 *   catch �� ���ǽ� �ڽ�(��ü) --> �θ�(�߻�) ������ �����ؾ� �Ѵ�  
	 */
	public static void main(String[] args) {
		//String str=null;
		String str="";
		try{
			System.out.println(str.concat("A"));
			System.out.println("E");
		}catch(IndexOutOfBoundsException ie){
			System.out.println("C");
		}catch (Exception e) {
			System.out.println("D");
		}
		System.out.println("B");
	}
}




