package step8;

public class TestSwitch3 {
	public static void main(String[] args) {
		MonthService service=new MonthService();
		int month=2;
		service.printLastDay(month);// 2월의 마지막 일은 28일입니다
		month=1;
		service.printLastDay(month);//1월의 마지막 일은 31일입니다
		month=4;
		service.printLastDay(month);//4월의 마지막 일은 30일입니다
		month=13;
		service.printLastDay(month);//잘못된 입력값입니다 
	}
}






