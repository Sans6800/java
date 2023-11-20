package OopsDemo;
//Main class to test Employee Class methods
public class EmployeeTest {

	public static void main(String[] args) {
		//Create objects of Employee class
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		// invoke methods of Employee class
		e1.inputEmployeeDetails();
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		
		e2.inputEmployeeDetails();
		e2.calculateNetSalary();
		e2.displayEmployeeDetails();
		
		e3.inputEmployeeDetails();
		e3.calculateNetSalary();
		e3.displayEmployeeDetails();

	}

}
