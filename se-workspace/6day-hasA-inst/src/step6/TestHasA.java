package step6;

public class TestHasA {
	public static void main(String[] args) {
		Student stu
       =new Student("아이유","15",
    		   new SmartPhone("갤럭시7", 100));
		System.out.println(stu.getName()+" "+stu.getStuId());
		System.out.println(stu.getSmartPhone().getModel());//갤럭시7
		System.out.println(stu.getSmartPhone().getPrice());//100
		//stu 객체의 스마트폰 모델명을 수정해서 아이폰7 출력되도록 한다
	    stu.getSmartPhone().setModel("아이폰7");
		System.out.println(stu.getSmartPhone().getModel());//아이폰7
	}
}






