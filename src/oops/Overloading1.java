package oops;

public class Overloading1 {
	
	//method name is same with no.of parameters different//;
public void m1() {
	System.out.println("m1 method"); 
}
public void m1(int id,String name) {
	System.out.println("m1 method:"+id);
}
public void m1(String name,int id) {
	System.out.println("m1 method"+name+ "name:"+id);
}

public static void main(String[] args) {
	Overloading1 o1=new Overloading1();
	o1.m1();
	o1.m1(123,"teja");
	o1.m1("teja",12);
}
}
