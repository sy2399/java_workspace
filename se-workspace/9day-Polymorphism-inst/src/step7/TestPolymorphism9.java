package step7;

public class TestPolymorphism9 {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
		/*service.calculateAnnualIncome(new Employee("������",200));
		service.calculateAnnualIncome(new Engineer("������",500,100));*/
		/*  2400
		 *  7200
		 */
		Employee empList[]=new Employee[3];
		empList[0]=new Employee("������",200);
		empList[1]=new Employee("������",400);
		empList[2]=new Engineer("��ȣ��",500,100);
		//���ؿ� �ʿ��� ���ΰǺ���� ����Ѵ� 
		service.calculateTotalCost(empList);//14400
	}
}









