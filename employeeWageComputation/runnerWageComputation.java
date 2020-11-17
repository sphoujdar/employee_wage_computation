package employeeWageComputation;

import java.util.Scanner;

public class runnerWageComputation {
	public static void main(String[] args) {
		
		System.out.println("This is calculation for first company with 5 employees\n\n");
		
		Company firstCompany = new Company(8 , 6, 20);
		
		firstCompany.addEmployee(1, true);
		firstCompany.addEmployee(2, true);
		firstCompany.addEmployee(3, false);
		firstCompany.addEmployee(4, true);
		firstCompany.addEmployee(5, false);
		
		
		System.out.println("Monthly wage for the added employees is : " + firstCompany.calculateMonthlyWage(firstCompany));
		
		
		
		
		System.out.println("\n\nThis is calculation for second company with 5 employees \n\n");
		
		
		Company secondCompany = new Company(9 , 5, 22);
		
		secondCompany.addEmployee(11, true);
		secondCompany.addEmployee(12, true);
		secondCompany.addEmployee(13, false);
		secondCompany.addEmployee(14, true);
		secondCompany.addEmployee(15, false);
		
		System.out.println("Monthly wage for the added employees is : " + secondCompany.calculateMonthlyWage(secondCompany));
		
		
		
		/*Scanner sc = new Scanner(System.in);
		boolean masterSwicthFlag = true;
		
		
		while(masterSwicthFlag) {
			
			System.out.println("Menu : \n\n"
					+ "1. Add an Employee \n"
					+ "2. Calculate and show Monthly wage Bill\n"
					+ "9. Exit");
			String expression = sc.nextLine();
			
				switch(expression) {
				  case "1":
					  
					  System.out.println("Please Enter an Employee ID.");
					  int switchEmployeeID = sc.nextInt();
					  
					  boolean switchEmployeeType = true;
					  String inputType;
					  boolean flag = true;
					  while (flag) {
						  System.out.println("Please Enter [P] if Employee is Part Time and [F] if employee is Full Time.");
						  inputType = sc.next();
						  if(inputType.equals("p") || inputType.equals("P") ) {
							  switchEmployeeType = false;
							  flag=false;
						  }else if(inputType.equals("f") || inputType.equals("F"))
						  {
							  switchEmployeeType = true;
							  flag=false;
						  }
						  else {System.out.println("Enter valid input.");}
					}
					  firstCompany.addEmployee(switchEmployeeID, switchEmployeeType);
					  break;
				  case "2":
					  System.out.println("Monthly wage for the added employees is : " + firstCompany.calculateMonthlyWage());
				    break;
				  case "9" :
					  masterSwicthFlag=false;
					  break;
				  default:
				    System.out.println("Enter one of the provided options.");
				}
				
			}
			sc.close(); */
		
	}

}
