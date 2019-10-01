package Seleniumpackage.divyapackage;

public class TestOne {

	public static void main(String[] args) {
		try {
			System.out.println(10/0); // ArithmeticException
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}


}
