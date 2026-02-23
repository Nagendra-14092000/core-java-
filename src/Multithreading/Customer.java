package Multithreading;

public class Customer {
	int bankbalance;
public void withdraw(int withdrawamount) throws InterruptedException {
	if (bankbalance<withdrawamount) {
		 wait();// don't release lock until the notify or notifyall
	}bankbalance=bankbalance-withdrawamount;
	System.out.println(bankbalance);
}
public void deposit(int depositamount) {
	bankbalance=bankbalance+depositamount;
	System.out.println(bankbalance);
	notify();//removing one thread from waiting state
}

}
