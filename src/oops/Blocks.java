package oops;

public class Blocks {
	{    //instance block
		System.out.println("instance block");
	}
static{//static block//
	System.out.println("static block");}
public Blocks() {
	//constructor block//
	System.out.println("constructor");
}
public void m1() {
	System.out.println("m1 method");
}
public static void main(String[] args) {
	Blocks b=new Blocks();
	b.m1();
}
}
