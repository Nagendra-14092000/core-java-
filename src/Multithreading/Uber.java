package Multithreading;

public class Uber extends Thread {
public void run() {
	data();
}

// which holds the class level lock -ub
public static synchronized void data() {
	for(int i=0;i<10;i++) {
		System.out.println("thread id  "+Thread.currentThread().getId());
	}
}  // data consistancy
public static void main(String[] args) {
	Uber u1=new Uber();
	Thread t1=new Thread(u1);
	t1.start();
	Thread t2=new Thread(u1);
	t2.start();
	
	Uber u2=new Uber();
	Thread t3=new Thread(u2);
	t3.start();
	Thread t4=new Thread(u2);
	t4.start();
}
}
