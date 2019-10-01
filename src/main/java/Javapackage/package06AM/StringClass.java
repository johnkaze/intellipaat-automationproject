package Javapackage.package06AM;

public class StringClass {

	/*String :: Pre-defined class. java.lang
	 * 
	 * 1. create
	 * 2. methods
	 * 
	 */
	
	public static void main(String[] args) {
		
		String str1 = "Hello Java world"; // By using String literal
		String str2 = "Java";
		String str3 = "JAVA";
		
		// By using new keyword
		
		String str4 = new String("java");
		String str5 = new String("java");
		
		//System.out.println(str1.length());
		
		//System.out.println(str1.substring(5, 16));
		
		//System.out.println(str1.trim());
		
		/*String arr[] = str1.split(" ");
		
		for(String data : arr) {
			System.out.println(data);
		}*/
		
		//System.out.println(String.valueOf(str1));
		//System.out.println(String.join("_", str1,str2, str3, str4,str5));
		
		
		/*char[] arr  = str1.toCharArray();
		for(char data : arr) {
			System.out.println(data);
		}*/
		
		//System.out.println(str5.equals(str4)); // false
		
		//System.out.println(str1.equalsIgnoreCase(str3)); // false
		
		//System.out.println(str1.codePointAt(0)); // 74 ASCII code
		//System.out.println(str3.codePointAt(0)); // 106
		
		//System.out.println(str3.compareTo(str1));
		
		//System.out.println(str1.compareToIgnoreCase(str3)); // 0
		
		//System.out.println(str1.toUpperCase());
				
		//System.out.println(str3.toLowerCase());
		
		//System.out.println(str1.contentEquals(str2));
		
		//System.out.println(str1.charAt(4));
		
		//System.out.println(str1.indexOf("a"));
		
		//System.out.println(str1.lastIndexOf("a"));
		
		
	}
}
