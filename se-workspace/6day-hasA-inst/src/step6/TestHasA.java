package step6;

public class TestHasA {
	public static void main(String[] args) {
		Student stu
       =new Student("������","15",
    		   new SmartPhone("������7", 100));
		System.out.println(stu.getName()+" "+stu.getStuId());
		System.out.println(stu.getSmartPhone().getModel());//������7
		System.out.println(stu.getSmartPhone().getPrice());//100
		//stu ��ü�� ����Ʈ�� �𵨸��� �����ؼ� ������7 ��µǵ��� �Ѵ�
	    stu.getSmartPhone().setModel("������7");
		System.out.println(stu.getSmartPhone().getModel());//������7
	}
}






