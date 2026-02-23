package oops;

public class Overloading3 {
	//if no of parameters are same then datatypes are also same and then order should be different//
	
public void m1(int id, String name) {
	System.out.println("id:"+id   + "name:"+name);
}
public void m1(String name,int id) {
	System.out.println("name:"+ name+ "id:"+id);
}
public static void main(String[] args) {
	Overloading3 o3=new Overloading3();
	o3.m1(23, "nag");
	o3.m1("java stop", 25);
}
}
