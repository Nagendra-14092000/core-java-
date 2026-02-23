package variable;

public class methods3 {
public int mobileprice() { 
	System.out.println("mobile method called");
	return 123;
	
}
public int electronicprice() {
	System.out.println("electronics price called:");
	return 3000;
}
public double amount() {
	System.out.println("amount method called");
	return 123.45;
		
}
public float miles() {
	System.out.println("miles method called");
	return 2.3f;
	
}
public String productname() {
	System.out.println("productname method called");
	return "iphone";
}
public void something() {
	System.out.println("something method called");
} 
public static void main(String[] args) {
	methods3 m3=new methods3();
	int mobileprice=m3.mobileprice();
	int electronicprice=m3.electronicprice();
	double amount=m3.amount();
	float miles= m3.miles();
	String productname=m3.productname();
	m3.something();
	
	System.out.println(mobileprice);
	System.out.println(electronicprice);
	System.out.println(amount);
	System.out.println(miles);
	System.out.println(productname);

	
}
}
