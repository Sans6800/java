package basicdemo;
//Program to count vowels
public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program to count vowels in a String  - a , e, i, o, u

//		String s="java is fun";
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter a Sentence :");
			String s=scan.nextLine(); // method takes sentence input 
			String s1=s.toLowerCase();
			scan.close();
			
			int count=0;
			
			System.out.println("The Length of String is : "+s.length());
			
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i) =='a' || s1.charAt(i) =='e' || s1.charAt(i) =='i' || 
						s1.charAt(i) =='o' || s1.charAt(i) =='u')
				{
					count+=1;
					System.out.println("Vowel found : "+s1.charAt(i));
				}
				
			}
			System.out.println("Total no. of vowels in string :"+count);




	}

}
