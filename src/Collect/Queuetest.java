package Collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuetest {
public void queuetest() {
	Queue<Integer> q=new LinkedList<Integer>();
	q.add(12);
	q.add(14);
	q.add(16);
	q.add(18);
	q.remove();
	//q.remove();
	
	for(Integer i:q) {
		System.out.println(i);
	}
	System.out.println("================");
}

public void priorityqueuetest() {
	PriorityQueue<String> pq=new PriorityQueue<String>();
	pq.add("aa");
	pq.add("tt");
	pq.add("mm");
	pq.add("dd");
	pq.add("ss");
	pq.remove();
	pq.remove();
	for(String i:pq) {
		System.out.println(i);
	}
}
public static void main(String[] args) {
	Queuetest q=new Queuetest();
	//q.queuetest();
	q.priorityqueuetest();
}
}
