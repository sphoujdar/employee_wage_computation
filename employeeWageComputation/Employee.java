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
	
	
	public Employee() {
		super();
		for (int days=0; days<31; days++)
		{
			Random attendanceBoolean = new Random(); // creating Random object
		    employeeMonthlyAttendance[days] = attendanceBoolean.nextBoolean();
		}
	}
	
	
}
