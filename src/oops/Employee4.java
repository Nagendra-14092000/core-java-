package oops;

public class Employee4 {
 int id ;
 String name;
 long salary;
 public Employee4() {
	 System.out.println("zero arguments");
 }
 public Employee4(int id,String name,long salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	 System.out.println(id+name+salary);
 }
 public static void main(String[] args) {
	Employee4 e4=new Employee4();
	System.out.println(e4.id);
	Employee4 e5=new Employee4(123,"bharat",12000);
	System.out.println(e5.id+e5.name+e5.salary);
}
}
