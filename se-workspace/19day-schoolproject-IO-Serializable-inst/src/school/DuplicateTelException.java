package school;

public class DuplicateTelException extends Exception{
	private static final long serialVersionUID = -4777520156818321640L;
	public DuplicateTelException(){
		super("전화번호가 중복됩니다!");
	}
	public DuplicateTelException(String message){
		super(message);
	}
}
