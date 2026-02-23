package Multithreading;

public class Airtel extends Thread{   //extend thread class
// multithreading means to perform multiple threads at a time
	
	//override the run method
	@Override
	public void run() {     // RUNNING
		System.out.println("run method");
	}
	public static void main(String[] args) {
		Airtel a1=new Airtel();   //we have create object of our custom class
		//a1.run();
		Thread t1=new Thread(a1); //we have to create thread class object //BORN
		//we are passed our custom object reference into thread object.
		t1.start(); //to start the thread we are used to start() method from thread   //RUNNABLE
		//then thread will start and calls run ();
	}
}

