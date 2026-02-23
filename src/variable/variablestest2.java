package variable;



public class variablestest2 {
	int id=50;//instance variable
	
    public int xyz() {
    	
    int id=20;//localvariables
    System.out.println(id);
    id=30;
    System.out.println(id);
    System.out.println(this.id);
    System.out.println(id);
    return id;
   
    }
    public static void main(String[] args) {
		variablestest2 vt2=new variablestest2();
		vt2.xyz();
	}
}
