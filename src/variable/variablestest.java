package variable;

public class variablestest {
	
	public int abc() {
		int a=10;
	
		a=12;	
		a=20;
		a=25;
		System.out.println(a);
		a=5;
		
		return a;
	}
public static void main(String[] args) {
	
	variablestest vt=new variablestest();
	System.out.println(vt.abc());
	
}
}
 