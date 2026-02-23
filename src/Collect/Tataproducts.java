package Collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tataproducts implements Comparable<Tataproducts>{
int id;
String name;
double price;
public Tataproducts(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
@Override
public int compareTo(Tataproducts o) {
	
	return this.id-o.id;   // based on id
	//return (int) (this.price-o.price);
	//return this.name.compareTo(o.name);
}
@Override
public String toString() {
	return "Tataproducts [id=" + id + ", name=" + name + ", price=" + price + "]";
}

public static <T> void main(String[] args) {
	Tataproducts t1=new Tataproducts(101, "tcs", 12.5);
	Tataproducts t2=new Tataproducts(102, "tanishique", 32.5);
	Tataproducts t3=new Tataproducts(104, "tata salt", 2.5);
	Tataproducts t4=new Tataproducts(103, "titan", 82.5);
	Tataproducts t5=new Tataproducts(105, "tata water", 62.5);
	
	List<Tataproducts> list=new ArrayList<Tataproducts>();
	list.add(t1);
	list.add(t2);
	list.add(t3);
	list.add(t4);
	list.add(t5);
	
	
	//Collections.sort(list);
	for(Tataproducts t:list) {
		System.out.println(t);
	}
}

}
