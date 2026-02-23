package variable;

public class methods1 {
	
	public byte id() {
		return 123;
	}
	public short num() {
		return 12345;
	}
	public int value() {
		return 123456789;
	}
	public long mobileno() {
		return 7569525716l;
	}
	public double amt() {
		return 2000.00;
	}
	public float miles() {
		return 11.11f;
	}
	public char grade() {
		return 'a';
	}
	public boolean areyouindian() {
		return true;
	}
	
	
public static void main(String[] args) {
	 methods1 m1=new methods1();
	
	byte val=m1.id();
	short val1=m1.num();
	int val2=m1.value();
	long val3=m1.mobileno();
	double val4=m1.amt();
	float val5=m1.miles();
	char val6=m1.grade();
	boolean val7=m1.areyouindian();
	

	System.out.println(val);
	System.out.println(val1);
	System.out.println(val2);
	System.out.println(val3);
	System.out.println(val4);
	System.out.println(val5);
	System.out.println(val6);
	System.out.println(val7);
}
}
