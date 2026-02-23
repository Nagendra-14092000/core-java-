package stringhandling;

public class Stringtest2 {
	public static void main(String[] args) {
	// scp-doesn't allow duplicate objects
	//before creating a new object in scp,the object will compare with .equals methods
	// if the same object available inscp,new object won't create
	//but in heap always create new object,it doesn't consider duoplications,bacause it doesn't compare to .equals method
	
String s1=new String("java");  // literal - scp
String s2="teja";              // object - heap
String s3=new String("java");
String s4="teja";
String s5="java";
String s6=new String("teja");
String s7="bharath";
String s8="teja";
String s9=new String("teja");
// == compare the object references (address)
System.out.println(s1==s2);// false
System.out.println(s1==s3);//false
System.out.println(s2==s4);//true
System.out.println(s5==s8);// false
System.out.println("===========================");
// .equals compares the content, it doesn't care about address,and memory location
System.out.println(s1.equals(s9));//false
System.out.println(s1.equals(s6));//false
System.out.println(s6.equals(s3));//false
System.out.println(s7.equals(s2));//false
System.out.println(s8.equals(s4));
 
}
}