package filehandling;

import java.io.Serializable;

public class Customer implements Serializable {
int cid;
String name;
long cardnum;
transient int cvv;  // cannot serializable
static int pin;   // cannot serializable
public Customer(int cid, String name, long cardnum, int cvv, int pin) {
	super();
	this.cid = cid;
	this.name = name;
	this.cardnum = cardnum;
	this.cvv = cvv;
	this.pin=pin;
}


@Override
public String toString() {
	return "Customer [cid=" + cid + ", name=" + name + ", cardnum=" + cardnum + "]";
}


public static void main(String[] args) {
	


}}
