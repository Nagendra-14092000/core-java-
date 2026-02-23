package practice;

public class Variables extends Variables1 {
	
	
	  int val=10;     //instance variable//
   static int i=11;  //static variable//
   
	public void m1() {   //instance method//
		int val=12;    //local variables//
		System.out.println(val);
		System.out.println(this.val);
		System.out.println(super.val);
	}
	public static void m2() {  //static method//
		int val=12;
		System.out.println(val);
	}
	
	
public static void main(String[] args) {
	int id;
	 id=12;     //local variable
	System.out.println(id);
	Variables v=new Variables();    //create object//
	System.out.println(v.val);      //ref.variable name//
	System.out.println(Variables.i); //classname.variablename//
	v.m1();
	v.m();
	v.m1(id);
	v.m2(id, null);
	
}
}
