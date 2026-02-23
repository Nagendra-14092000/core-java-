package oops;

public class Cred extends Billdesk{
public void loans() {
	System.out.println("loans by cred");
}
public void upipayments() {
	System.out.println("upipayments by cred");
}
public void cards() {
	System.out.println("cards by cred");
}
public void cibilscore() {
	System.out.println("cibilscore by cred");
}public static void main(String[] args) {
	Cred c=new Cred();
	c.loans();
	c.cards();
	c.upipayments();
	c.paymentprocess();
}
}
