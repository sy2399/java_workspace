package step4;

public class MyDate {
	private int day;
	private int month;
	public int getDay(){
		return day;
	}
	public void setDay(int day){
		if(day>0&&day<32){
			this.day=day;
		}else{
			System.out.println("�߸��� ���Դϴ�");
		}
	}
	public int getMonth(){
		return month;
	}
	public void setMonth(int month){
		if(month>0&&month<13){
		this.month=month;
		}else{
			System.out.println("�߸��� ���Դϴ�");
		}
	}
}















