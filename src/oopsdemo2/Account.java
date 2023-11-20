package oopsdemo2;

public class Account {
	
	private String name;
	protected double balance;
	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// final methods cannot be overridden
		final void deposit(double amt) {
	        balance += amt;
	        System.out.println("Depositing: " + amt);
	    }

	    void withdraw(double amt) {
	        balance -= amt;
	        System.out.println("WithDrawing: " + amt);

	    }

}
