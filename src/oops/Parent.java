package oops;

public class Parent {
public void m1(int id) {
	System.out.println("parent m1 method"+id);
}
public static void main(String[] args) {
	Parent p=new Parent();
	p.m1(10);
}
}
