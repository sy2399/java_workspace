package step7;

public class TestSwitch2 {
	public static void main(String[] args) {
		String type="b";
		switch(type){
		case "a":
			System.out.println("�ƿ��");
			break;
		case "b":  case "c":
			System.out.println("���׽ý�");
			break;
		case "d": case "e":
			System.out.println("���");
			break;
		default:
			System.out.println("��");
		}
	}
}




