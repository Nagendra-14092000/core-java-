package oops;

public class Cycledeliverypartner extends DeliveryPartner {
public void ecofriendly() {
	System.out.println("ecofriendly by cycledeliverypartner");
}@Override
public void deliverorder() {
	System.out.println("deliverordered by cycledeliverypartner");
}
public static void main(String[] args) {
	Cycledeliverypartner cdp=new Cycledeliverypartner();
	cdp.acceptorder();
	cdp.pickuporder();
	cdp.ecofriendly();
	cdp.deliverorder();
}
}
