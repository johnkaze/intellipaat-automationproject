package Javapackage.package09AM;

public class StringExample {

	/*
	 * String :: java.lang
	 *  sequence of chars declared in "".
	 * 
	 *
	 * 
	 * String Literal ::  String name = "Chandra";
	 * 
	 * new keyword
	 * 
	 * String str = new String("Java"); 
	 * 
	 */

	public static void main(String[] args) {

		/*String name = "Chandra";
		System.out.println(name);

		String str = new String("Java"); 
		System.out.println(str);*/

		char c = 'h'; // ASCII code h = 104, H = 72
		int i = (int) c;

		//System.out.println(i);

		String str1 = "hello Java";
		String str2 = "HELLO JAVA";
		String str3="";

		//System.out.println(str1.equals(str2)); // true, flase
		//System.out.println(str2.length());// 10

		//System.out.println(str1.equalsIgnoreCase(str2));// true

		//System.out.println(str1.concat(" wolrd"));

		//System.out.println(str1.charAt(9));

		//System.out.println(str1.substring(6, 10)); //Java

		//System.out.println(str1.compareTo(str2)); // +ve, -ve, 0 

		//System.out.println(str1.compareToIgnoreCase(str2)); // +ve, -ve, 0

		//System.out.println(str1.replace("h", "H"));
		
		/*String[] arr = str1.split(" ");
		
		for(String data : arr) {
			System.out.println(data);
		}*/
		//System.out.println(str1);
		
		//System.out.println(str1.trim());

		/*System.out.println(str1.indexOf("l"));
		System.out.println(str1.lastIndexOf("l"));*/
		
		/*char[] arr = str1.toCharArray();
		for(char cr : arr) {
			System.out.println(cr);
		}*/
		
		//System.out.println(str1.startsWith("e"));
		//System.out.println(str1.endsWith("a"));
		
		//System.out.println(str1.contains("S"));
		
		/*System.out.println(str1.isEmpty());
		System.out.println(str3.isEmpty());*/
		
		
		/*System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());*/
		
		
		
		
	}

}
