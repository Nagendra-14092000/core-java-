package variable;

public class MethodsTypes {
public int m1() { //instance method
	return 123;
}
public static int m2() { //static method
	return 1234;
	
}
public double m3() {
	return 12.00;
}
public static void main(String[] args) {
	MethodsTypes mt=new MethodsTypes();
	System.out.println(mt.m1());
	System.out.println(MethodsTypes.m2());
	System.out.println(mt.m3());
}
}
