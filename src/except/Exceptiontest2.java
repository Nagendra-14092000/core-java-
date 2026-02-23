package except;

public class Exceptiontest2 {
public static void main(String[] args) {
	                 // one try block any associate with multiple catch blocks..
	try {
	int i=10;
	int j=0;
	int k=i/j;
	System.out.println(k);}

  catch (ArrayIndexOutOfBoundsException e) 
	{ e.printStackTrace(); }
	
	catch(RuntimeException e) 
	{ e.printStackTrace(); }

		catch (Exception e) {
  e.printStackTrace(); }
 
	catch (Throwable e) {
		e.printStackTrace();
	}
}
}
