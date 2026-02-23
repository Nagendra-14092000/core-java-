package oops;

public class Child extends Parent {
	@Override
public void m1(int id) {
	System.out.println("child m1 method:"+id);
}
public void m2() {
	System.out.println("child m2 method");
}
public static void main(String[] args) {
	Child c=new Child();
	c.m1(21);
	c.m2();
	
}
}
