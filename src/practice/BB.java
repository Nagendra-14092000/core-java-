package practice;

public class BB extends AA{
	@Override
	public void m1() {
		System.out.println("child class m1 method");    
	}
	@Override             // private methods e can't override//
	private void m2() {
		System.out.println("child class m2 method");
	}
	               //static methods we can't override//
	public static  void m3() {
		System.out.println("child class m3 method");
	}
	@Override               //final methods we can't override//
	public final void m4() {
		System.out.println("child class m4 method");
	}
	public static void main(String[] args) {
		BB b=new BB();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		
	}
}
