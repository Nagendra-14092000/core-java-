package oops;

public class Savingsaccount extends Account implements ATMservices,Onlineservices{
public void accounttype() {
	System.out.println("savings account");
}
	@Override
	public void fundstransfer() {
		System.out.println("funds transfer using online services");
		
	}

	@Override
	public void withdraw() {
		System.out.println("amount withdraw by atm services");
		
	}
	public static void main(String[] args) {
		Savingsaccount s=new Savingsaccount();
		s.accounttype();
		s.dispute();
		s.fundstransfer();
		s.withdraw();
	}

}
