package oops;

public class Bikedeliverpartner extends DeliveryPartner {
public void wearhelmet() {
	System.out.println("wearhelmet by bikedeliverpartner ");
}
public void deliverorder() {
	System.out.println("deliver ordered by bike deliverpartner");
}
public static void main(String[] args) {
	Bikedeliverpartner bdp=new Bikedeliverpartner();
	bdp.acceptorder();
	bdp.pickuporder();
	bdp.wearhelmet();
	bdp.deliverorder();
	
}
}
