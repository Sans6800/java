package basicdemo;
//prgm to display odd & even nos between 1 & 10
/*
ODD		EVEN
---		----
1		2
3		4
5		6
7		8
9		10	  
*/



public class OddEvenDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		System.out.println("odd /t  even");
		System.out.println("--- /t  ----");
		while(n<=10)
		{ 	if(n%2!=0)
				System.out.print(n+" /t  ");
		    else
		    	System.out.println(n);
			n++;
		}
			
				
		}
		

	}


