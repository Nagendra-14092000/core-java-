package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Textfile {
public static void main1(String[] args) throws IOException {
	File file=new File("C:\\Users\\NAGENDRA BABU\\OneDrive\\New folder\\test.txt");
    FileWriter fw=new FileWriter(file);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("teja it");
	bw.newLine();
	bw.write("your java stop");
	bw.newLine();
	bw.write("hyderabad");
	bw.close();
	fw.close();
	System.out.println("created file successfully");}
	public static void main(String[] args) throws IOException {
		
	File file=new File("C:\\Users\\NAGENDRA BABU\\OneDrive\\New folder\\test.txt");
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	while(line!= null) {
		System.out.println(line);
		line=br.readLine();
	}
	br.close();
	fr.close();
	}
}

