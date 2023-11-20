package OopsDemo;
//Java program to implement OOP
public class StudentTest {

	public static void main(String[] args) {
		//Create a object of Student class
		Student s1=new Student();
		Student s2=new Student();
		
		//Invoke methods of student class using period(.) operator
		s1.input();
		float total=s1.calculate();//invokes method and returns value
		s1.display();
		System.out.println("Total displayed from Main: "+total);
		
		s2.input();
		float total2=s2.calculate();//invokes method and returns value
		s2.display();
		System.out.println("Total displayed from Main: "+total2);
	}

}
