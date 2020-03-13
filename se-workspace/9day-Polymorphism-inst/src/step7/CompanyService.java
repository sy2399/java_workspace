package step7;

public class CompanyService {
	public void calculateAnnualIncome(Employee e) {
		int money=e.getSalary();
		if(e instanceof Engineer){
			money+=((Engineer) e).getBonus();
		}
		System.out.println(money*12);
	}

	public void calculateTotalCost(Employee[] empList) {
		int money=0;
		for(int i=0;i<empList.length;i++){
			money+=empList[i].getSalary();
			if(empList[i] instanceof Engineer){
				money+=((Engineer) empList[i]).getBonus();
			}
		}		
		System.out.println(money*12);
	}	
}





