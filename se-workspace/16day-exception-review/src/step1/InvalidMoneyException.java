package step1;

public class InvalidMoneyException extends Exception {
	private static final long serialVersionUID = 2822310619334321249L;
	public InvalidMoneyException(){
		super("�߸��� �ݾ��Դϴ�");
	}
	public InvalidMoneyException(String message){
		super(message);
	}
}
