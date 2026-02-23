package stringhandling;

public class Stringtest4 {
public static void main(String[] args) {
	String s1="teja";
	String s2=" it";
	String s3=s1+s2;
	System.out.println(s3);
	
	// string is immutable class-we can't modify the data
	String s4="teja it";
	String s5=s4.concat("  your java stop!");
	System.out.println(s5);
}
}
