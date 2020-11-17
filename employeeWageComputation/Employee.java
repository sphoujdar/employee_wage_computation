package employeeWageComputation;
import java.util.Random; 

public class Employee {
	
	int employeeID;
	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public boolean isEmployeeType() {
		return employeeType;
	}


	public void setEmployeeType(boolean employeeType) {
		this.employeeType = employeeType;
	}


	boolean employeeType;
	boolean[] employeeMonthlyAttendance = new boolean[35];
	
	public void viewEmployeeData(Company tempObject) {
		
		int tempEmployeeWorkingHours = 0 ;
		
		if (this.employeeType) {System.out.println("Emp ID : " + this.employeeID + " works as Full Time employee."); tempEmployeeWorkingHours = tempObject.fullDayHour;}
		else {System.out.println("Emp ID : " + this.employeeID + " works as Part Time employee."); tempEmployeeWorkingHours = tempObject.halfDayHour;}
		
		for (int attendanceDay = 0 ; attendanceDay < this.employeeMonthlyAttendance.length ; attendanceDay++) {
			if (this.employeeMonthlyAttendance[attendanceDay]) {
				System.out.println(this.employeeID + " was present on day" + (attendanceDay+1) + ". His wage for the day is " + tempEmployeeWorkingHours*tempObject.wagePerHour );	
			}
		}
	}
	
	
	public Employee() {
		super();
		for (int days=0; days<31; days++)
		{
			Random attendanceBoolean = new Random(); // creating Random object
		    employeeMonthlyAttendance[days] = attendanceBoolean.nextBoolean();
		}
	}
	
	
}
