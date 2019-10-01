package Javapackage.package07AM;

public class LoopingStmts {

	/*
	 * Looping statements ::
	 * 
	 * 1. for loop :: 
	 * 		int i=0;	i<10;
	 * for(initialize; condition; increment/decrement) {
	 * 
	 * }
	 * 
	 * 2. while loop :: 
	 * 3. do while loop :: 
	 * 4. for each loop ::
	 * 
	 * break :: 
	 * continue :: 
	 * 
	 */



	void forLoop() {
		// print numbers from 0 to 10


		for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}

		//System.out.println("Out of for loop");

		// infinite for loop

		//for(;;) { System.out.println("Infinite for loop"); }

	}

	void whileLoop() {
		int i = 0;
		/*
		 *  while(i <= 10) { System.out.println(i); i++; }
		 * System.out.println("Out of while loop");
		 */

		// infinite while loop

		while(true) { 
			System.out.println(i); 
			i++; 
		}

	}

	void doWhileLoop() {
		int i = 0;
		do {

			System.out.println(i);
			i++;
			
			if(i == 20) { break; }
			
		} 
		while(i <= 10);
		//System.out.println("Out of do while loop");
	}

	public static void main(String[] args) {
		LoopingStmts obj = new LoopingStmts();
		obj.forLoop();
		//obj.whileLoop();
		//obj.doWhileLoop();
	}
}
