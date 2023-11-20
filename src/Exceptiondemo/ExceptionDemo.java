package Exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Languages[]= {"C","C++","Java","Perl","Python"};
		String a=null;
		try {
			for(int i=0;i<5;i++) {
				System.out.println(Languages[i]);
			}
			System.out.println(a.length());
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
