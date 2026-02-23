package stringhandling;

public class test {
	public static void main(String[] args) {
		Employee e=new Employee(101, "nazeer", "guntur");
		//e.id=200;
		System.out.println(e.getId()+" "+e.getName()+" "+e.getCity());
	}
}
