package Javapackage.package08am;

public class LoopingStmts {
	
	static void forLoop() {

		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				System.out.println("Before break");
				//break;// To terminate
				continue;  // To skip
			}
			System.out.println(i);
			System.out.println("After if");
		}
		
		System.out.println("out of for loop");
	}
	
	/*static void whileLoop() {
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("out of loop");
	}
	
	static void doWhileLoop() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 5);
		System.out.println("out of loop");
	}*/
	
	public static void main(String[] args) {
		forLoop();
		//whileLoop();
		//doWhileLoop();
	}

}
