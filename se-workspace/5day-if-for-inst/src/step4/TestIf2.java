package step4;

public class TestIf2 {
	public static void main(String[] args) {
		MyDate d=new MyDate();
		System.out.println(d.getDay());//0
		d.setDay(11);
		System.out.println(d.getDay());//11
		d.setDay(32);// 잘못된 일입니다
		System.out.println(d.getDay());//11
		d.setDay(0);// 잘못된 일입니다
		System.out.println(d.getDay());//11
		System.out.println("**********");
		d.setMonth(1);
		System.out.println(d.getMonth()+"월");// 1월 
		d.setMonth(0); // 잘못된 월입니다 
		d.setMonth(13);// 잘못된 월입니다 
		d.setMonth(12);
		System.out.println(d.getMonth()+"월");// 12월 
	}
}














