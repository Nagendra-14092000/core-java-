package oops;

public class Employee3 {
int id;
String name;
long salary;

public Employee3() {
	System.out.println("zero argument constructor");
}public Employee3(int empid ){
	id=empid;
	System.out.println("int arg constructor  "+empid);
}
public Employee3(int empid,String empname) {
	id=empid;
	name=empname;
	System.out.println("int and string arguments"+id+ name);
}
public Employee3(int empid,String empname,long empsalary) {
	id=empid;
	name=empname;
	salary=empsalary;
	System.out.println(empid+empname+salary);
}
	

public static void main(String[] args) {
	Employee3 e3=new Employee3();
	Employee3 e4=new Employee3(123);
	System.out.println(e4.id);
	Employee3 e5=new Employee3(123,"nag");
	System.out.println(e5.id+e5.name);
	Employee3 e6=new Employee3(123,"nag",10000);
	System.out.println(e6.id+" "+e6.name+"  "+e6.salary);
  
}
}
