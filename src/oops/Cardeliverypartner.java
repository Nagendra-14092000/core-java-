package oops;

public class Cardeliverypartner extends DeliveryPartner {
public void largeordersupport() {
	System.out.println("largeordersupport by car deliverypartner");
}@Override
public void deliverorder() {
	System.out.println("deliver ordered by cardeliverypartner");
}
public static void main(String[] args) {
	Cardeliverypartner cdp=new Cardeliverypartner();
	cdp.acceptorder();
	cdp.pickuporder();
	cdp.largeordersupport();
	cdp.deliverorder();
}
}
