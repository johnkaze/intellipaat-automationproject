package Javapackage.divyapackage;

public class StringClass {

    /*String :: Pre-defined class. java.lang
     *
     * 1. create
     * 2. methods
     *
     */

    public static void main(String[] args) {

        String str1 = "Hello Java world"; // By using String literal
        String str2 = "JAVA";
        String str3 = "JAVA";

        // By using new keyword

        String str4 = new String("JAVAA");
        String str5 = new String("javaaaaa");

        // Methods in String class

        //System.out.println("Number of chars in str1 :: " + str1.length());

        /*System.out.println(str1.indexOf("l"));
        System.out.println(str1.lastIndexOf("l"));

        System.out.println(str1.charAt(14));

        System.out.println(str1.trim());

        System.out.println(str1.substring(6, 10));

        System.out.println(str2.equals(str3));

        System.out.println(str2.equalsIgnoreCase(str3));
		
		String arr[] = str1.split(" ");
		
		for(String data : arr) {
			System.out.println(data);
		}

        System.out.println(String.valueOf(10.13));
        System.out.println(String.join("@", str1,str2, str3, str4,str5));
		
		
		char[] arr1  = str1.toCharArray(); // 'H'
		for(char data : arr1) {
			System.out.println(data);
		}*/

        //System.out.println(str1.codePointAt(0)); // 72 ASCII code
        //System.out.println(str3.codePointAt(0)); //

        //System.out.println(str4.compareTo(str5));

        //ASCII Code of str4 = str5 :: 0, str4 > str5 :: +ve number, str4 < str5 :: -ve Number

        //System.out.println(str4.compareToIgnoreCase(str5)); // 0

        //System.out.println(str1.toUpperCase());

        //System.out.println(str3.toLowerCase());

        //System.out.println(str3.contentEquals(str2));


    }
}
