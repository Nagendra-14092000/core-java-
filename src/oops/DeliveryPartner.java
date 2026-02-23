package oops;

public class DeliveryPartner {
public void acceptorder() {
	System.out.println("accept ordered by restaurant");
}
public void pickuporder() {
	System.out.println("pick ordered by restaurant");
}
public void deliverorder() {
	System.out.println("deliver ordered by delivery partner");
}
public static void main(String[] args) {
	DeliveryPartner dp=new DeliveryPartner();
	dp.acceptorder();
	dp.pickuporder();
	dp.deliverorder();
}
}
