package oopsdemo2;

class SoftwareEngineer{
	
	protected String name,tech;
	double salary;
	
	public SoftwareEngineer(String name, String tech, double salary) {
		this.name = name;
		this.tech = tech;
		this.salary = salary;
	}
	
	final void display()//final methods cannot be overridden
	{
		System.out.println(name+" "+tech+" "+salary);
	}
	
	void work()
	{
		System.out.println("Coding & Testing");
	}
}

class Developer1 extends SoftwareEngineer{

	public Developer1(String name, String tech, double salary) {
		super(name, tech, salary);
	}
	void work()//Overridden Method
	{
		System.out.println("Software Development using: " +tech);
	}
}

class Tester extends SoftwareEngineer{

	public Tester(String name, String tech, double salary) {
		super(name, tech, salary);
		
	}
	void work()//Overridden Method
	{
		System.out.println("Software Testing using: " +tech);
	}
}
public class OvverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SoftwareEngineer s1=new SoftwareEngineer("Navin", "Java Full Stack",35000);
		
		Developer1 d1 =new Developer1("Gosling", "Java", 25000);
		Tester t1=new Tester("Mike", "JMeter", 20000);
		
		// invokes base class method
		s1.display();
		s1.work();
		
		d1.display(); // invokes base class method
		d1.work();   // invokes derived class overridden method
		
		t1.display();
		t1.work();// invokes derived class overridden method
		

	}

}
