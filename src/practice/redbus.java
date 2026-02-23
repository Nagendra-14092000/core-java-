package practice;

public  class redbus implements phonepay {

	@Override
	public void booking() {
		// TODO Auto-generated method stub
		String from="atchampeta";
		String to="madipadu";
		int price=30;
		System.out.println("booking red bus");
		System.out.println("from="+from);
		System.out.println("to="+to);
		System.out.println("amount="+price);
	}
public static void main(String[] args) {
	redbus rd=new redbus();
	rd.booking();
	System.out.println("name:"+name);
}

}
