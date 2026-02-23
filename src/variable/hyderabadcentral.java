package variable;

public class hyderabadcentral {
	
	int total=0;
	
	public int mobiles() {
		int realme=12000;
		int vivo=13000;
		 total=realme+vivo;
		return total;}
	
	public int appliances() {
		int fridge=15000;
		int ac=20000;
		 total=fridge+ac;
		return total;}
	
		public int electronics() {
	int laptop=25000;
	int tv=30000;
 total=laptop+tv;
	return total;
	
	}
public static void main(String[] args) {
	hyderabadcentral hc=new hyderabadcentral();
int totalmobilebill	=hc.mobiles();
int totalappliancesbill=hc.appliances();
int totalelectronicsbill=hc.electronics();

	System.out.println("mobilebill:"+hc.mobiles());
	System.out.println("appliancesbill:"+hc.appliances());
	System.out.println("electronicsbill:"+hc.electronics());
	int totalamt=totalmobilebill+totalappliancesbill+totalelectronicsbill;
	System.out.println("totalbill:"+totalamt);

}
}
