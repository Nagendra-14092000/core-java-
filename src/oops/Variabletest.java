package oops;

public class Variabletest extends Variableparent {
	int id=10;      //instance avriable//
public void test() {
	int id=20;      //local variable//    
	System.out.println(id);
	System.out.println(this.id);   //this keyword//we can access instance variable in the same class//   
	System.out.println(super.id);  //super keyword//we can access instance variable in different class// 
}
public static void main(String[] args) {
	Variabletest vt=new Variabletest();
	vt.test();
}
}
