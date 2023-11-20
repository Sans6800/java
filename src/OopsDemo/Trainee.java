package OopsDemo;

public class Trainee {
	//attributes
	private int id;
	private String name,tech;
	private double stipend;
	
	//constructors
	public Trainee() {//implicit constructor
		this.id=555;
		this.name="Rod Jhonson";
		this.tech="Spring";
		this.stipend=8600;
	}
	public Trainee(int id,String name, String tech,double stipend)
	{//parameterized constructor
		//super();
		this.id=id;
		this.name=name;
		this.tech=tech;
		this.stipend=stipend;
	}
	
	void display() {
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
	}
	
	

}
