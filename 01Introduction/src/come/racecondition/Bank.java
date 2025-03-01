package come.racecondition;

public class Bank {
	int accountnumber;
	double balance;
	public Bank(int accountnumber , double balance) {
		this.accountnumber=accountnumber;
		this.balance=balance;
	
	}
	public void withdrawn(double amount) {
		this.balance= this.balance-amount;
		System.out.println("closing balance is  when withdrawn "+this.balance );
	}
	public void deposit(double amount) {
		this.balance=this.balance+amount;
		System.out.println("closing balance is when deposit  "+this.balance );
	}

}
