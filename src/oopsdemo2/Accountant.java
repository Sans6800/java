package oopsdemo2;

public class Accountant extends Employee {
	private String task,tech;

	public Accountant(int empId, String name, String t1, String t2) {
		super(empId, name);
		// TODO Auto-generated constructor stub
		this.task=t1;
		this.tech=t2;
		
	}
	void print() {
		System.out.println("Accountant Tasks: "+task);
		System.out.println("Software used: "+tech);
	}
	

}
