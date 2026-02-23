package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Transactiontest implements Runnable {
 private int transactionid;

  public Transactiontest(int transactionid) {
	super();
	this.transactionid = transactionid;
} 

  @Override
  public void run() {
	System.out.println("transaction id  "+transactionid+"is processing by"+Thread.currentThread().getName());
  }
public static void main(String[] args) {
	ExecutorService es=Executors.newFixedThreadPool(2);
	es.submit(new Transactiontest(101));
	es.submit(new Transactiontest(102));
	es.submit(new Transactiontest(103));
	es.submit(new Transactiontest(104));
	es.submit(new Transactiontest(105));
	es.shutdown();
}
}
