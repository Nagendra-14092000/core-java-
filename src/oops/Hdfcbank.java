package oops;

public class Hdfcbank extends Cred {
	@Override
public void loans() {
	System.out.println("loans by hdfc");
	
}@Override
public void upipayments() {
	System.out.println("upipayments by hdfc");
}@Override
public void cards() {
	System.out.println("cards by hdfc");
}
public void cheque() {
	System.out.println("cheque by hdfc");
}
public static void main(String[] args) {
	Hdfcbank hdfc=new Hdfcbank();
	hdfc.loans();
	hdfc.cards();
	hdfc.upipayments();
	hdfc.cheque();
	hdfc.cibilscore();
	hdfc.paymentprocess();
	
}
}
