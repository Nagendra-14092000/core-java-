package oops;

public abstract class  NSE {
	//we can create normal methods and abstracts methods //
	//class+interface=abstract class//
	
public void stocksinfo() {
	System.out.println("infosys,bajaj,tcs,hindalco,zomato");
}
public void ipo() {
	System.out.println("flipkart,blinkit,amazon");
}
public void holidays() {
	System.out.println("aug15,dec25,may1");
}
public abstract void brokeragecharges();
{System.out.println("instance block");
	}
static{System.out.println("static block");
	}
public NSE() {
	System.out.println("nse constructor");
}
public static void main(String[] args) {
	
}
}

