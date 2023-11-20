package OopsDemo;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		
		//invoke setter Methods - Input
		b1.setBookId(101);
		b1.setBookName("Programming in Java");
		b1.setPrice(500);
		b1.setPublisher("BPB Publications");
		
		//invoke getter methods - output
		System.out.println("********** Book Details************");
		b1.display();
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		//System.out.println("Discount Price: "+b1.discountPrice());
		

	}

}
