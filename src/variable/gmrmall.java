package variable;

public class gmrmall {
	public int gentswear() {
		int shirt=500;
		int jeans=1000;
		int total=shirt+jeans;
		return total;
	}
	public int jewellery() {
		int gold=10000;
		int silver=1000;
		int total=gold+silver;
		return total;
	}
	
	public static void main(String[] args) {
		gmrmall a=new gmrmall();
		int gentswear=a.gentswear();
		System.out.println("gentswear:"+gentswear);
		int jewellery=a.jewellery();
		System.out.println("jewellery"+jewellery);
		
		int totalbill=gentswear+jewellery;
		System.out.println("totalbill:"+totalbill);

		
	}

}
