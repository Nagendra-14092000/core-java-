package oops;

public class Accountholdertest {
public static void main(String[] args) {
	Accountholder aht=new Accountholder();
	aht.setHoldername("raju");
	aht.setAccountnumber(123245412);
	aht.setIfsc("CBINO284457");
	aht.setBalance(2000);
	System.out.println(aht.getAccountnumber());
	System.out.println(aht.getHoldername());
	System.out.println(aht.getIfsc());
	System.out.println(aht.getBalance());
}
}
