package step2;

public class TestRefArray1 {
	public static void main(String[] args) {
		Person[] pa=new Person[3];
		System.out.println(pa[0]);
		pa[0]=new Person("아이유",24);
		pa[1]=new Person("강동원",30);
		pa[2]=new Person("하현우",32);
		// pa 배열 요소의 이름을 모두 출력하세요 
		for(int i=0;i<pa.length;i++)
			System.out.println(pa[i].getName());
		System.out.println("=============");
		// pa 배열 요소 중 25세 이상인 회원이름 나이 출력
		for(int i=0;i<pa.length;i++){
			if(pa[i].getAge()>=25){
				System.out.println(pa[i].getName()+" "+pa[i].getAge());
			}
		}
	}
}









