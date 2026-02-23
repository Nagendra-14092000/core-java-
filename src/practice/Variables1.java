package practice;

public class Variables1 {
int val=10;
public void m() {   //instance method//	
	System.out.println("m method");
}
public void m1(int id) {
	System.out.println("m1 method:"+id);
}
public static void m2(int id,String name) {  //static method//
	System.out.println("m2 method:    id:"+id   +"   name:"+name);
}
public static void main(String[] args) {
	Variables1 v1=new Variables1();
	v1.m();
	v1.m1(12);
	v1.m2(12, "nagendra");
}
}
