package Javapackage.package09AM;

public class ExceptionHandling {

	/* Exception Handling ::

Types Exceptions ::

1. Compile time (Checked ) exceptions ::
2. Run time (Unchecked) exceptions ::

try, catch, finally

throws key word

throw key word

Exception ::

ArithmeticException
FileNotFoundException
ArrayIndexOutofBoundsException
NullPointerException

	 */


	void m1() {
		System.out.println("Dividing 10 by zero");
		//System.out.println(10/0); // / by zero
		Test obj = new Test();
		try {
			//obj.m2();
			System.out.println(10/0); // / by zero
		} catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch(NullPointerException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block");
			obj = null;
		}
		System.out.println("Done");
	}

	void m2() throws InterruptedException {
		System.out.println("Start of m2");
		Thread.sleep(10000);
		//System.out.println(10/0); // / by zero
		System.out.println("Done");
	}

	void m3(int age)  {
		try {
			if(age >= 18) {
				System.out.println("Can be vote");
			} else {
				throw new CustomException("Age is less than 18 years so not able vote");
			}
		} catch(CustomException e ) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}


	public static void main(String[] args)  {
		ExceptionHandling obj = new ExceptionHandling();
		obj.m3(17);
	}









}
