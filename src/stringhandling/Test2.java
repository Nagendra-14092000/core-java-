package stringhandling;

public class Test2 {

public void m1(String str) {
	System.out.println("string");
}
public void m1(StringBuffer sb) {
System.out.println("stringbuffer");	
}
public void m1(StringBuilder sbu) {
System.out.println("stringbuilder");	
}
public static void main(String[] args) {
	Test2 t2=new Test2();
	//t2.m1(null);    // ambiguity
	t2.m1("java");
	StringBuffer sb=new StringBuffer("stringbuffer");
	t2.m1(sb);
	StringBuilder sbu=new StringBuilder("stringbuilder");
	t2.m1(sbu);
}
}
