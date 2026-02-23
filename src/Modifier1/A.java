package Modifier1;

import Modifier2.C;    //public data we can access anywhere in the project//create classes,variables,metods//
import Modifier2.D;    //default data we can access in the same package//create class,variables,methods// 
                        //private data we can access in the same class//do not create class//
  class A {
  private void m1() {
	System.out.println("a class m1 method");
}  private void  a1() {
	System.out.println("a class a1 method");
}

public static void main(String[] args) {
	A a=new A();
	a.m1();
	a.a1(); 
	//B bm1=new B();
	//bm1.bm1();//
	C cm1=new C();
	//cm1.cm1();
	D dm1=new D();
	dm1.dm1();
}
}
