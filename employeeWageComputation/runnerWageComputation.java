package employeeWageComputation;


public class runnerWageComputation {
	public static void main(String[] args) {
		System.out.println("Just starting out with the program.");
		
		Company firstCompany = new Company();
		
		firstCompany.addEmployee(1, true);
		//firstCompany.addEmployee(2, true);
		firstCompany.addEmployee(3, false);
		firstCompany.addEmployee(4, true);
		firstCompany.addEmployee(5, false);
		//firstCompany.addEmployee(6, true);
		
		System.out.println("Monthly wage for the added employees is : " + firstCompany.calculateMonthlyWage());
		
	}	

}
