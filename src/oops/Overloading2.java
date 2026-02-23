package oops;

public class Overloading2 {
	
	//if no. of parameters are same datatypes are different//
public void m1(int id) {
	System.out.println("int parameter "+id);
}
public void m1(String name) {
	System.out.println("string parameter "+name);
}
public void m1(double amt) {
System.out.println("double parameter "+amt);	
}
public static void main(String[] args) {
	Overloading2 o2=new Overloading2();
	o2.m1(12);
	o2.m1("teja");
	o2.m1(12.22); 
	
}
}
