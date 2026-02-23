package Multithreading;

public class Txntask extends Thread {
int transactionid;

public Txntask(int transactionid) {
	super();
	this.transactionid = transactionid;
}
@Override
public  void run() {
	System.out.println("transaction id  "+transactionid+"is processing by"+Thread.currentThread().getName());
}
public static void main(String[] args) {
	Txntask tx1=new Txntask(101);
	Thread t1=new Thread(tx1);
	Thread t2=new Thread(new Txntask(102));
	Thread t3=new Thread(new Txntask(103)); 
	Thread t4=new Thread(new Txntask(104));
	Thread t5=new Thread(new Txntask(105));
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	
	
}
}
