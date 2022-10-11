package week1day2;

public class Employeedetails {
public void employeName()
 {
 String EmployeName= "Prithiviraj";
 int EmployeID = 317;
 System.out.println("Employe Name = "+EmployeName);
 System.out.println("Employe ID = "+EmployeID);
}
public void employeeAdress() {
String EmployeeAdress = "Perambalur";
System.out.println("Employee Adress = "+EmployeeAdress);
}
public void EmployeeSalary() {
	Double EmployeWage = 86547.46565;
	System.out.println("Employe Salary = Rs "+EmployeWage+"/-");
}
public void EmployeeMobileNumber() {
	Long MobileNumber = 9597955649L;
	System.out.println("Employee Mobile Number = "+MobileNumber);
}
public static void main(String[] args) {
	Employeedetails details = new Employeedetails();
	details.employeName();
	details.employeeAdress();
	details.EmployeeSalary();
	details.EmployeeMobileNumber();
	
	
	
	
	
}
}