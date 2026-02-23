package variable;

public class methods2 {
	
		

	
	
	 
	
public static void main(String[] args) {
	methods1 m1=new methods1();
	
	hyderabadcentral hc=new hyderabadcentral();
	methods3 m3=new methods3();
	
	int mobileprice=m3.mobileprice();
	int electronicprice=m3.electronicprice();
	double amount=m3.amount();
	float miles= m3.miles();
	String productname=m3.productname();
	
	System.out.println(mobileprice);
	System.out.println(electronicprice);
	System.out.println(amount);
	System.out.println(miles);
	System.out.println(productname);
	
	System.out.println(hc.mobiles());
	System.out.println(hc.appliances());
	System.out.println(hc.electronics());
	
	
	short val1=m1.num();
	int val2=m1.value();
	long val3=m1.mobileno();
	double val4=m1.amt();
	float val5=m1.miles();
	char val6=m1.grade();
	boolean val7=m1.areyouindian();
	
	System.out.println(m1.id());
	System.out.println(val1);
	System.out.println(val2);
	System.out.println(val3);
	System.out.println(val4);
	System.out.println(val5);
	System.out.println(val6);
	System.out.println(val7);
	

}
}
