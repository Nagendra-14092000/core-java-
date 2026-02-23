package oops;

public class Customer {
    int id;
    String name;
    long salary;
	public Customer(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
    public static void main(String[] args) {
		Customer c=new Customer(12, "raju", 22);
		System.out.println(c.id+"   "+c.name+"  "+c.salary);
	}
}
