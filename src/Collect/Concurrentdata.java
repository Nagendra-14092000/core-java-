package Collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Concurrentdata {
	public void onmap() {
		
		Map<Integer, String> map=new ConcurrentHashMap<Integer, String>();
		map.put(101, "amc");
		map.put(102, "kfc");
		map.put(103, "dominos");
		map.put(104, "pizza hut");
		map.put(105, "mc donalds");
		for(Entry<Integer, String> entry:map.entrySet()) {
			map.put(107, "burger");
			map.put(108, "ice burg");
			map.remove(103);
			System.out.println(entry);
		}
	}
	public void onlist() {
		List<Integer> li=new CopyOnWriteArrayList<Integer>();
		li.add(101);
		li.add(102);
		li.add(103);
		li.add(105);
		
		for(Integer i:li) {
			if(i==105) {
			li.add(104);
			
			System.out.println(i);
		}
			}
		System.out.println("------------------");
		for(Integer i:li) {
			System.out.println(i);
		}
	}
	public void onset() {
		Set<Integer> set=new  CopyOnWriteArraySet<Integer>();
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(104);
		for(Integer i:set) {
			set.add(105);
			System.out.println(i);
		}
		for(Integer i:set) {
			System.out.println(i);
		}
	}
public static void main(String[] args) {
	Concurrentdata ct=new Concurrentdata();
	ct.onmap();
	//ct.onlist();
	//ct.onset();
}
}
