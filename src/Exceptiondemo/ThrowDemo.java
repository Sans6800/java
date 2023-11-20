package Exceptiondemo;

public class ThrowDemo {

	public static void hello(int a) {
		if(a==0) {
			throw new ArithmeticException("Pass non-zero values");
		}else {
			System.out.println("Passed value is: "+a);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello(100);
		hello(0);

	}

}
