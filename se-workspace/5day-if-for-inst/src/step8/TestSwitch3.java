package step8;

public class TestSwitch3 {
	public static void main(String[] args) {
		MonthService service=new MonthService();
		int month=2;
		service.printLastDay(month);// 2���� ������ ���� 28���Դϴ�
		month=1;
		service.printLastDay(month);//1���� ������ ���� 31���Դϴ�
		month=4;
		service.printLastDay(month);//4���� ������ ���� 30���Դϴ�
		month=13;
		service.printLastDay(month);//�߸��� �Է°��Դϴ� 
	}
}






