package step4;

public class TestIf2 {
	public static void main(String[] args) {
		MyDate d=new MyDate();
		System.out.println(d.getDay());//0
		d.setDay(11);
		System.out.println(d.getDay());//11
		d.setDay(32);// �߸��� ���Դϴ�
		System.out.println(d.getDay());//11
		d.setDay(0);// �߸��� ���Դϴ�
		System.out.println(d.getDay());//11
		System.out.println("**********");
		d.setMonth(1);
		System.out.println(d.getMonth()+"��");// 1�� 
		d.setMonth(0); // �߸��� ���Դϴ� 
		d.setMonth(13);// �߸��� ���Դϴ� 
		d.setMonth(12);
		System.out.println(d.getMonth()+"��");// 12�� 
	}
}














