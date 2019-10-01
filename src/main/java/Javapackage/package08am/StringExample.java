package Javapackage.package08am;

public class StringExample {

	public static void main(String[] args) {

		// By using String literal
		
		String str1 = "Hello Java world";
		String str2 = "Java";
		String str3 = "JAVA";
		
		// By using new keyword
		
		String str4 = new String("java");
		String str5 = new String("java1");

		System.out.println(str1);
		
		//System.out.println("Number of chars :: "+str1.length());

		//System.out.println(str1.indexOf("a"));
		//System.out.println(str1.lastIndexOf("a"));
		
		//System.out.println(str1.substring(6, 10));
		
		//System.out.println(str1.trim());
		
		/*String[] arr = str1.split(" ");
		
		for(String data : arr) {
			System.out.println(data);
		}*/
		
		//System.out.println(String.valueOf(str1));
		//System.out.println(String.join("_", str1,str2, str3, str4,str5));
		
		
		/*char[] arr1  = str1.toCharArray();

		for(char data : arr1) {
			System.out.println(data);
		}*/
		
		//System.out.println(str5.equals("java1"));
		
		//System.out.println(str2.equalsIgnoreCase(str1));
		
		//System.out.println(str1.codePointAt(0)); // 72 ASCII code
		//System.out.println(str3.codePointAt(0)); // 74
		
		/*System.out.println(str3.compareTo(str1)); // sum of ascii of str3 - sum of ascii of str1 ==
		System.out.println(str1.compareTo(str3)); //
		System.out.println(str1.compareTo(str1)); // 0 str1 - str1 = 0

		System.out.println(str1.compareToIgnoreCase(str3));*/
		
		//System.out.println(str1.toUpperCase());
				
		//System.out.println(str3.toLowerCase());
		
		//System.out.println(str1.contentEquals(str2));
		
		//System.out.println(str1.charAt(4));

		
	}
}
