package practice;

public class B extends A{
public void bike() {
	System.out.println("B class bike");
}
public void car() {
	System.out.println("B class car");
}
public static void main(String[] args) {
//	B b=new B();           //child sub class//
//	b.bike();
//	b.car();
//	b.gold();
//	A a=new A();
//	
//	a.car();
//	a.gold();

	
	
	A a1=new B();   
	a1.gold();
	a1.car();
	
	
	
}
}
