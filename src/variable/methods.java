package variable;

public class methods {
public int mobile() {
	System.out.println("mobiles method ");
	return 123;
}
public int amount() {
	System.out.println("amount method called");
	return 1200;
}
public static void main(String[] args) {
	methods m=new methods();
	System.out.println(m.mobile());
	int salaryamount=m.amount();
	System.out.println(salaryamount);
	int salaryamountwithbonus=salaryamount+1000;
	System.out.println(salaryamountwithbonus);
	int totalsalaryamt=salaryamountwithbonus+1000;
	System.out.println("total salary:"+totalsalaryamt);
}
}
