package step4;

public class TestObjectInit2 {
	public static void main(String[] args) {
		MyDate m=new MyDate(1,12);
		//1월 12일이 출력된다 
		System.out.println(m.getMonth()+"월 "+m.getDay()+"일");
		MyDate m2=new MyDate(1,32);
		//1월 1일이 출력된다 
		System.out.println(m2.getMonth()+"월 "+m2.getDay()+"일");
		MyDate m3=new MyDate(13,12);
		//1월 1일이 출력된다 
		System.out.println(m3.getMonth()+"월 "+m3.getDay()+"일");
	    /*  월은 1~12사이 
	     *  일은 1~31사이
	     *  둘 중 하나라도 만족되지 않으면 무조건 1월 1일 setting 
	     */
	}
}










