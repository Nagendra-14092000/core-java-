package Multithreading;

public class ATM {
	
      volatile boolean maintanancemode=false;
      
public  void transactionprocess() {
	System.out.println("customer came to transaction process");
	while(maintanancemode) {
		
	}
	System.out.println("atm is stopped for maintanance");
}
public void maintanance() {
	System.out.println("admin changing maintanancemode..");
	maintanancemode=true;
}
public static void main(String[] args) throws InterruptedException {
	ATM atm=new ATM();
	Thread atmtransactions=new Thread(new Runnable() {

		@Override
		public void run() {
			atm.transactionprocess();
			
		}
		
	});
	atmtransactions.start();
	Thread.sleep(2000);
	atm.maintanance(); 
}
}
