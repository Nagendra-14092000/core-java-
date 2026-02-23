package oops;

public class Abhibus implements phonepay {
	
	//classes allow to write normal methods//
@Override	
public void ticketbooking() {
	String from="guntur";
	String to="hyderabad";
	String name="nagendra";
	int ticketprice=1000;
	System.out.println("from:"+from);
	System.out.println("to:"+to);
	System.out.println("name:"+name);
	System.out.println("ticketprice:"+ticketprice);
}
public static void main(String[] args) {
	Abhibus a=new Abhibus();
	a.ticketbooking();
}
}
