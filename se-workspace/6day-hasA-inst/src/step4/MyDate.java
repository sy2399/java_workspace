package step4;

public class MyDate {
	private int month = 1;
	private int day = 1;
	public MyDate(int month, int day) {
		if (month > 0 && month < 13 && day > 0 && day < 32) {
			this.month = month;
			this.day = day;
		}
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}

}
