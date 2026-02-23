package variable;

public class lulumall {
	
	public int mobiles() {
	int realme=12000;
	int vivo=13000;
	int total=realme+vivo;
	return total;}
	
	public int appliances() {
		int tv=10000;
		int ac=20000;
		int total=tv+ac;
		return total;
	}
	
	
public static void main(String[] args) {
	lulumall m=new lulumall();
	int totalmobiles=m.mobiles();
	System.out.println("mobile bill:"+totalmobiles);
	int totalappliances=m.appliances();
	System.out.println("appliancesbill:"+totalappliances);
	
	int totalbill=totalmobiles+totalappliances;
	System.out.println("totalbill:"+totalbill);
}
}
