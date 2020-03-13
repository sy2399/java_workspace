package step2;

public class TestRefArray2 {
	public static void main(String[] args) {
		Person[] pa={new Person("설현",20),
				new Person("하현우",32),new Person("정우성",30)};
		//배열 요소의 나이를 +10 처리 
		//for
		for(int i=0;i<pa.length;i++){
			pa[i].setAge(pa[i].getAge()+10);
		}			
		// 배열 요소 나이 이름 출력 
		for(int i=0;i<pa.length;i++)
			System.out.println(pa[i].getName()+" "+pa[i].getAge());		
	}
}




