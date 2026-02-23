package except;

public class Exceptiontest3 {
@SuppressWarnings("finally")
public int m1() {
	try {
	int i=10;
	int j=0;
	int k=i/j;
	System.out.println(k);
	return 10;}
	catch (Exception e) {
		e.printStackTrace();
		return 20;
	}
	finally{
		return 30;
	}
}
public static void main(String[] args) {
	Exceptiontest3 et3= new Exceptiontest3();
	System.out.println(et3.m1());
}
}
