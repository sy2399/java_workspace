package step7;

public class TestSwitch2 {
	public static void main(String[] args) {
		String type="b";
		switch(type){
		case "a":
			System.out.println("¾Æ¿ìµð");
			break;
		case "b":  case "c":
			System.out.println("Á¦³×½Ã½º");
			break;
		case "d": case "e":
			System.out.println("¸ð´×");
			break;
		default:
			System.out.println("²Î");
		}
	}
}




