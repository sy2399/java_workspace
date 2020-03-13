package step7;

public class TestPolymorphism9 {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
		/*service.calculateAnnualIncome(new Employee("아이유",200));
		service.calculateAnnualIncome(new Engineer("강동원",500,100));*/
		/*  2400
		 *  7200
		 */
		Employee empList[]=new Employee[3];
		empList[0]=new Employee("김태희",200);
		empList[1]=new Employee("아이유",400);
		empList[2]=new Engineer("강호동",500,100);
		//한해에 필요한 총인건비용을 출력한다 
		service.calculateTotalCost(empList);//14400
	}
}









