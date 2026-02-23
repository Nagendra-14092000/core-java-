package oops;

public class Accountholder {
private String holdername;
private int accountnumber;
private int balance;
private String ifsc;



public String getHoldername() {
	return holdername;
}



public void setHoldername(String holdername) {
	this.holdername = holdername;
}



public int getAccountnumber() {
	return accountnumber;
}



public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
}



public int getBalance() {
	return balance;
}



public void setBalance(int balance) {
	this.balance = balance;
}



public String getIfsc() {
	return ifsc;
}



public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}



public static void main(String[] args) {
	Accountholder ah=new Accountholder();
	
}
}
