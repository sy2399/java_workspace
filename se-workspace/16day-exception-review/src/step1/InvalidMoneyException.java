package step1;

public class InvalidMoneyException extends Exception {
	private static final long serialVersionUID = 2822310619334321249L;
	public InvalidMoneyException(){
		super("잘못된 금액입니다");
	}
	public InvalidMoneyException(String message){
		super(message);
	}
}
