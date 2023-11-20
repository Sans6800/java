package oopsdemo2;

class Staff{
	private int empId;
	private String name;
	protected float salary,hra;
	
	public Staff(int empId, String name, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	void getHRA()
	{
		hra=(salary*60)/100;
		System.out.println("HRA :"+hra);
	}
	
	void display()
	{
		System.out.println(empId+" "+name+" "+salary);
	}
	
	void print()
	{
		System.out.println("Gross Salary of Staff :"+(salary+hra));
	}
}

class Manager extends Staff{
	protected float da;//protected variables can be accessed in derived class
	private float gross;
	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);
		// TODO Auto-generated constructor stub
	}
	
	void getDA()
	{
		da=(salary*80)/100;
		System.out.println("DA is : "+da);
	}
	
	void getGross()
	{
		gross= salary+hra+da;
		System.out.println("Gross Salary of Manager is :"+gross);
	}
	
}
//Multi Level Inheritance Staff--->Manager--->Director
class Director extends Manager{
	private float ta,gross;
	public Director(int empId, String name, float salary) {
		super(empId, name, salary);
		// TODO Auto-generated constructor stub
	}
	void getTA()
	{
		ta=(salary*30)/100;
		System.out.println("TA is :"+ta);
	}
	
	void getGross()
	{
		gross= salary+hra+da+ta;
		System.out.println("Gross Salary of Director is :"+gross);
	}
}

public class MultiLevelDemo{
	
	public static void main(String[] args){
		Director d1=new Director(101,"Keane",5000);
		
		System.out.println("*********** Director Details ***********");
		d1.display(); // staff
		d1.getHRA();  // staff
		d1.getDA();  // manager
		d1.getTA();  // director
		d1.getGross();  //director
		
		Manager m1=new Manager(201,"Mary",4000);
		
		System.out.println("*********** Manager Details ***********");
		m1.display();
		m1.getHRA();
		m1.getDA();
		m1.getGross();
		
		Staff s1=new Staff(301,"Helen",2000);
		System.out.println("*********** Staff Details ***********");
		s1.display();
		s1.getHRA();
		s1.print();
	}
}