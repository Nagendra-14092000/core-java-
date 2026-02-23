package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializabletest {
	


public static void main(String[] args) throws IOException {
	Customer c=new Customer(101, "raju", 7598664649l, 2415, 75242);
	System.out.println(c);
	FileOutputStream fos=new FileOutputStream("C:\\Users\\NAGENDRA BABU\\OneDrive\\New folder\\customer.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos); //written code converts into byte code
	oos.writeObject(c);  //writing object
	oos.close();
	fos.close();
	System.out.println("serialization done");
	
}
}

