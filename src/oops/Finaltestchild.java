package oops;

public class Finaltestchild extends Finaltestparent {
	 final int id=20;//initialization//
	@Override
public void m1() {
long amt=1999;
	System.out.println("child m1 method"+amt);
}
	public void m2() {
		int id=10;
		System.out.println(+id);
		
	}
public static void main(String[] args) {
	Finaltestchild ftc=new Finaltestchild();
	ftc.m1();
	ftc.m2();
	
	
	
	
}
}
