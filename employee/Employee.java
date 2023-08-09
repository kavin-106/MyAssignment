package employee;


public class Employee {
	public void getEmployeedetails(int employeeId) 
	{
		System.out.println(employeeId);
	}
	public void getEmployeedetails(int employeeId,String name) 
	{
		System.out.println(employeeId +"  "+ name);
	}
	public void getEmployeedetails(int employeeId,String name,String email)
	{
		System.out.println(employeeId +"  "+ name +"  "+ email);
	}
	public void getEmployeedetails(int employeeId,String name,String email,long telephone) 
	{
		System.out.println(employeeId +"  "+ name +"  "+ email+"  "+telephone);
	}
	public static void main(String[] args) 
	{
		Employee EmployeeInfo =  new Employee();
		EmployeeInfo.getEmployeedetails(102);
		EmployeeInfo.getEmployeedetails(102, "Kavin");
		EmployeeInfo.getEmployeedetails(102, "Kavin", "kavinhpkd18@gmail.com");
		EmployeeInfo.getEmployeedetails(102, "Kavin", "kavinhpkd18@gmail.com", 7639617050L);
	}
}


