package step5;

public class ScoreBoard {	
	public void printGrade(int point) {
		if(point>100||point<0){
			System.out.println("�߸��� �Է°�");
		}else if(point>=90){
			System.out.println("��");
		}else if(point>=80){
			System.out.println("��");
		}else if(point>=70){
			System.out.println("��");
		}else if(point>=60){
			System.out.println("��");
		}else{
			System.out.println("��");
		}
	}
}





