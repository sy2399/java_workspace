package school;

public class DuplicateTelException extends Exception{
	private static final long serialVersionUID = -4777520156818321640L;
	public DuplicateTelException(){
		super("��ȭ��ȣ�� �ߺ��˴ϴ�!");
	}
	public DuplicateTelException(String message){
		super(message);
	}
}
