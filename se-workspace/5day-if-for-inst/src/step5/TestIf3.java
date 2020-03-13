package step5;

public class TestIf3 {
	public static void main(String[] args) {
		ScoreBoard board=new ScoreBoard();
		board.printGrade(99);//수 
		board.printGrade(80);//우 
		board.printGrade(79);//미 
		board.printGrade(60);//양
		board.printGrade(0);//가 
		board.printGrade(-1);//잘못된 입력값 
		board.printGrade(101);//잘못된 입력값 
	}
}





