package step3;

public class TestException2 {
	public static void main(String[] args) {
		String name=null;
		try{ // try : ���� �߻� ���� ���� ��ȭ �� �� ����ϴ� Ű���� 
			System.out.println(name.length());
		}catch(NullPointerException ne){
			System.out.println("��ó���: �̸� ������ ��� ���̸� ���� �� ����");
		}
		System.out.println("���α׷� ���� ���� �� ����");
	}
}
