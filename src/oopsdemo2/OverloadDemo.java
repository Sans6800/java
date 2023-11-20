package oopsdemo2;

public class OverloadDemo {

	public static void main(String[] args) {
		
		Addition a1= new Addition();
		
		a1.add();
		a1.add(200, 300);
		a1.add(34.55f, 40.55f);
		a1.add(20, 30, 50);
		a1.add("Hello", "World");

	}

}
