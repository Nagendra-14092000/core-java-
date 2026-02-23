package Multithreading;

public class Idea extends Thread {
@Override	
public void run() {
	for(int i=1;i<=10;i++) {
		System.out.println("thread id="+Thread.currentThread().getId()+" "+i);
	}
}
public static void main(String[] args) {
	Idea i=new Idea();
	Thread t1=new Thread(i);
	t1.start();
	Thread t2=new Thread(i);
	t2.start();
	Thread t3=new Thread(i);
	t3.start();
}
}
