package Collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Settest {
public void hashsettest() {
	Set<Integer> set=new HashSet<Integer>();
	set.add(101);
	set.add(102);
	set.add(103);
	set.add(104);
	set.add(null);
	for(Integer i:set) {
		System.out.println(i);
	}
}
public void linkedhashset() {
	Set<Integer> set=new LinkedHashSet<Integer>();
	set.add(101);
	set.add(102);
	set.add(103);
	set.add(104);
	set.add(null);
	set.add(null);
	for(Integer i:set) {
		System.out.println(i);
	}
}
public void treeset() {    // don't allow null values
	Set<Integer> set=new TreeSet<Integer>();
	set.add(101);
	set.add(102);
	set.add(103);       
	set.add(103);
	//set.add(null);
	for(Integer i:set) {
		System.out.println(i);
	}
	
}
public static void main(String[] args) {
	Settest st=new Settest();
	st.hashsettest();
    //st.linkedhashset();
	//st.treeset();
} 

}
