package except;

public class Customer {
	int bill=500;
public void payment(int amt) {
	if (bill<amt) {
	System.out.println("payment success");}
	else {
		System.out.println("transaction fail");
	}
	//throw new Insufficientfundsexception();
	throw new Insufficientfundsexception("add funds");
}
public static void main(String[] args) {
	Customer c=new Customer();
	c.payment(1000);
}
}
