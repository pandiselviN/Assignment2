package Assignment2;

public class EmployeDetail {
	public void printEmpName() {
		String empName="Raja";
		int empId=6;
	     System.out.println("Employee name : " +empName);
	     System.out.println("Employee id : " +empId );
    }
	public void getEmpSalary() {
		double empSalary=40000;
		System.out.println("Employee salary : " +empSalary);
	}
	public void getEmpAdress() {
	String empAdress="t.nagar";
		System.out.println("Employee address : "  +empAdress);
	}
	public void empPhoneNum() {
		long mobNum =9942958365L;
		System.out.println(" Employee Phone number : "  +mobNum);
	}
	public static void main (String args[]) {
		EmployeDetail emp = new EmployeDetail();
		emp.printEmpName();
		emp.getEmpSalary();
		emp.getEmpAdress();
		emp.empPhoneNum();
	}
}

		
	
		

	
	
