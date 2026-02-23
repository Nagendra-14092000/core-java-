package oops;

public class Savingsaccount1 extends Account implements ATMservices,Onlineservices{
	@Override
	public void fundstransfer() {
		// TODO Auto-generated method stub
		System.out.println("funds transfer by online");
	}
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw amount by atm");
	}

public static void main(String[] args) {
	Savingsaccount s1=new Savingsaccount();
	s1.dispute();
	s1.withdraw();
	s1.fundstransfer();
}
}
