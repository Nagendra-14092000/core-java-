package Collect;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Maptest {
public void hashmaptest() {   
	    //pan id  //id           //keys don't allow duplicate        
	   //key    //value         //values allow duplicate
	Map<String, String> map=new HashMap<String, String>();
	map.put("BHS132DE", "BHARATH");               // entry
	map.put("NAS123ED", "NAGENDRA");
	map.put("Nav456gs", "NAVEEN");
	map.put("MAN765GY", "MANJITH");
	//map.put("Nav456gs", "navaneeth");
	map.put("SAI123TY", "BHARATH");
	map.put(null, "yaseen");
	map.put("ADE123gt", null);
	map.put("ADE123t", null);
	for(Entry<String, String> entry:map.entrySet()) {
		System.out.println(entry);
	}
}
public void treemaptest() {
	//sorting order
	Map<String, String> map=new TreeMap<String, String>();
	map.put("BHS132DE", "BHARATH");               // entry
	map.put("NAS123ED", "NAGENDRA");
	map.put("Nav456gs", "NAVEEN");
	map.put("MAN765GY", "MANJITH");
	map.put("Nav456gs", "navaneeth");
	map.put("SAI123TY", "BHARATH");
	 map.put(null, "yaseen");
	map.put("ADE123gt", null);
	for(Entry<String, String> entry:map.entrySet()) {
		System.out.println(entry);
	}
}
public void linkedhashmap() {
	Map<String, String> map=new LinkedHashMap<String, String>();
	map.put("BHS132DE", "BHARATH");               // entry
	map.put("NAS123ED", "NAGENDRA");
	map.put("nav456gs", "NAVEEN");
	map.put("MAN765GY", "MANJITH");
	map.put("nav456gs", "navaneeth");
	map.put("SAI123TY", "BHARATH");
	map.put(null, "SAI ");
	 map.put(null, "yaseen");
	 map.put(null, "raju");
	map.put("ADE123gt", null);
	map.put("ADE13gt", null);
	for(Entry<String, String> entry:map.entrySet()) {
		System.out.println(entry);
	}
}
public void hashtabletest() {
	Hashtable<String,Integer> ht=new Hashtable<String, Integer>();
	ht.put("AB123", 101);
	ht.put("CD456", 102);
	ht.put("EF789", 103);
	ht.put("YS234", 104);
	//ht.put(null, 105);
	//ht.put("RF546", null);
   for(Entry<String, Integer> entry:ht.entrySet()) {
	 // System.out.println(entry.getKey()+entry.getValue());
	   System.out.println(entry);
   }
}
public static void main(String[] args) {
Maptest mt=new Maptest();
 mt.hashmaptest();
   // mt.treemaptest();
  // mt.linkedhashmap();
 // mt.hashtabletest();
}
}
