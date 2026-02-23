package oops;

public class Payment {
	//cash payment//
public void pay(String paymenttype,int amt) {
	System.out.println("paymenttype:"+paymenttype+ "amount:"+amt);
}
//card payment//
public void pay(String paymenttype,int amt,long cardno) {
	System.out.println("paymenttype:"+paymenttype+"amount:"+amt+"cardno:"+cardno);
}
//upi payment//
public void pay(String paymenttype,int amt,String upiid) {
	System.out.println("paymenttype:"+paymenttype+"amount:"+amt+"upiid:"+upiid);
}
public static void main(String[] args) {
	Payment pay=new Payment();
	pay.pay("cash", 500);
	pay.pay("card", 1500, 197589375l);
	pay.pay("upi", 1000, "nag@ybl");
}
}
