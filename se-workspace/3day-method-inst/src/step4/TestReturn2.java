package step4;

public class TestReturn2 {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		int num1=1;
		int num2=3;
		int result=c.plus(num1,num2);
		System.out.println("더하기 결과:"+result);
		// * 
		System.out.println("곱하기 결과:"+c.multiply(2,4));
	}
}










