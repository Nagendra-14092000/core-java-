package Collect;

public class Typecasting {
public static void main(String[] args) {
	int i=10;
	long l=i;      // implicit type casting
	
	long l2=500;
	int i2=(int)l2;// explicit typecasting
	
	Object ob="teja it";
	String s=(String) ob;
	String i4=ob+s;
	
	float f=11.09f; 
	double d=f;
	Object ob2=d+f;
	
	Object ob1="nag@123";
	int i1=(int) ob1;
	
	String s1="teja it";
    Object i3=s1;
	
	
}
}
