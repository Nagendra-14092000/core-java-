package Collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Listtest {
public void arraylisttest() {
	//<>-generic
	//<e>-element type-use only classes
	//type-integer,string,double,employee,customer
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10); //0
	al.add(20); //1
	al.add(30); //2
	al.add(40); //3
	al.add(50);
	al.add(60);
	al.add(70);
	al.add(80);
	al.add(3, 10);
	al.remove(2);
	al.get(2);
	System.out.println(al.get(2));
	System.out.println("==================");
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	for(Integer val:al) {
		System.out.println(val);
	}
}
public  void linkedlisttest() {
	LinkedList<Integer> li=new LinkedList<Integer>();
	                   li.add(10);
	                   li.add(20);
	                   li.add(30);
	                   li.add(40);
	                   li.add(1, 15);
	         
	                   for(Integer val:li) {
	                	   System.out.println(val);
	                   }
	                   
}
public void vectortest() {
	Vector<String> v=new Vector<String>();
	          v.add("sai");
	          v.add("nagendra");
	          v.add("raju");
	          v.add("yesu");
	          for(String str:v) {
	        	  System.out.println(str);
	          }
	          
			
}
public void stacktest() {
	 Stack<String> s=new Stack<String>();
	 s.push("sai");
	 s.push("nagendra");
	 s.push("yesu");
	 s.push("raju");
	 s.pop();
	 s.pop();
	 System.out.println(s.peek());
	 for(String str:s) {
		 System.out.println(str);
	 }
}
public static void main(String[] args) {
	Listtest lt=new Listtest();
	lt.arraylisttest();
	//lt.linkedlisttest();
	//lt.vectortest();
	//lt.stacktest();
}
}
