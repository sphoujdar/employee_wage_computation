package employeeWageComputation;

import java.util.ArrayList;

public class Company {
	ArrayList<Employee> roster = new ArrayList<Employee>();
	
	int fullDayHour = 8;
	int halfDayHour = 6;
	
	int wagePerHour = 20;
	
	
	
	public void addEmployee(int emp_id , boolean emp_type) {
		Employee newEmployee = new Employee();
		newEmployee.setEmployeeID(emp_id);
		newEmployee.setEmployeeType(emp_type);
		roster.add(newEmployee);
	}
	
	public int calculateMonthlyWage() {
		int monthlyWage = 0; 
		for (Employee currentEmployee : roster) {
			
			
			int daysAttended = 0;  
			for (int dayOfMonth = 0 ; dayOfMonth < currentEmployee.employeeMonthlyAttendance.length ; dayOfMonth++) {
				
				if(currentEmployee.employeeMonthlyAttendance[dayOfMonth]) {
					daysAttended+=1;
				}
			}
			
			
			int currentEmployeeWagePerDay;
			if (currentEmployee.employeeType) {
				currentEmployeeWagePerDay = wagePerHour*fullDayHour;
			}else {
				currentEmployeeWagePerDay = wagePerHour*halfDayHour;
			}
			
			monthlyWage += monthlyWage + (daysAttended*currentEmployeeWagePerDay);
			
			currentEmployee.viewEmployeeData();
		}
		
		return monthlyWage;
	}
	
}
