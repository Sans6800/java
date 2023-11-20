package OopsDemo;
/*
 * Constructor is a special method with the same name of a class, 
 * which initializes an Object.
 * Same name as the class and no return type.
 * Special Method invoked whenever an instance of a given class is created. 
 */

public class ConstructorDemo {
	
	int id;
	String name;
	ConstructorDemo(){//implicit constructor
		System.out.println("I am Implicit Constructor");
	}
	
	ConstructorDemo(int id,String name){//Parameterized Constructor
		this.id=id;
		this.name=name;
	}
	
	void display() {
		System.out.println(this.id+" "+this.name);
	}

	public static void main(String[] args) {
		ConstructorDemo cd1=new ConstructorDemo();//invoke implicit constructor
		ConstructorDemo cd2=new ConstructorDemo();
		ConstructorDemo cd3=new ConstructorDemo();
		
		ConstructorDemo cd4=new ConstructorDemo(101,"Gosling");//invoke parameterized constructor
		cd4.display();

	}

}
