package stringhandling;

public class Stringtest3 {
public static void main(String[] args) {
	String s="teja it";
	System.out.println(s.charAt(2));
	System.out.println(s.compareTo(s));
	System.out.println(s.concat("   your java stop"));
	System.out.println(s.contains("ja"));
	System.out.println(s.endsWith("it"));
	System.out.println(s.equals("teja it"));
	System.out.println(s.equalsIgnoreCase("teja it"));
	System.out.println(s.hashCode());
	System.out.println(s.indent(4));
	System.out.println(s.indexOf("a"));
	System.out.println(s.isBlank());
	System.out.println(s.isEmpty());
	System.out.println(s.length());
	System.out.println(s.startsWith("te"));
	System.out.println(s.replace("t", "k"));
	char[] chara=s.toCharArray();
	System.out.println(chara);
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	String s2="your java stop";
	String[] strarr=s2.split(" ");
	for(String words:strarr) {
		System.out.println(words);
	}
	
}
}
