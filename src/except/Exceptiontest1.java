package except;

public class Exceptiontest1 {
public void arithmetic() {
	
	// something value/zero  //
	
	System.out.println("arithmetic start");
	try {
	int i=100;
	int j=0;
	int k=i/j;
	System.out.println(k);}
	catch(ArithmeticException e) {
		e.printStackTrace();      // it prints the exception//
	}
	
	
	System.out.println("arithmetic end");
}
public void arrayindex() {
	
	System.out.println("array index start");
	try {
	int arr[]=new int[4];
	
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	//arr[4]=50;
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);}
	catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();        
	}
	System.out.println("array index end");}


public void nullpointer() {
	System.out.println("null point start");
	try {
	Integer i=null;
	int j=10;
	int k=i+j;
	System.out.println(k);}
	catch (NullPointerException e) {
		e.printStackTrace();
	}
	System.out.println("null point ends");
}
public void numberformat() {
	System.out.println("number format start");
	try {
	String s="123abc";
	
	 Integer val=Integer.valueOf(s);   //converting string value into integer value//
	
	 System.out.println(val);}
	catch (NumberFormatException e) {
		e.printStackTrace();
	}
	System.out.println("number format end");
}
public void interrupted() {
	System.out.println("interrupted start");
	for(int i=0;i<5;i++) {
		System.out.println(i);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	System.out.println("interrupted end");
}
public void interrupted2() throws InterruptedException {
	for(int i=0;i<5;i++) {
		System.out.println(i);
		Thread.sleep(3000);
	}
}

public static void main(String[] args) throws InterruptedException {
	Exceptiontest1 et=new Exceptiontest1();
	//et.arithmetic();
	//et.arrayindex();
	//et.nullpointer();
	//et.numberformat();
	//et.interrupted();
	et.interrupted2();
}
}
