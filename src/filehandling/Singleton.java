package filehandling;

public class Singleton {

	private static Singleton singletonobj=null;
	
	public static Singleton getinstance() {
		if(singletonobj==null) {
			singletonobj=new Singleton();
		}
		return singletonobj;
		
	}
	
	public static void main(String[] args) {
		Singleton s1=Singleton.getinstance();
		Singleton s2=Singleton.getinstance();
		Singleton s3=Singleton.getinstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}
