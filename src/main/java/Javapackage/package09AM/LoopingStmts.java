package Javapackage.package09AM;

public class LoopingStmts {
	/*
	 * Looping statements :: 
	 * 
	 * 1. for :: for fixed number of iterations.
	 * 2. while :: As long as the condition is true.
	 * 3. do while :: Before checking condition our block of code should execute at least one time.
	 * 
	 */

	void forLoop() {

		for(int i=0; i<=10; i++) {
			System.out.println(i);// 0, 1,2,3,4,5,6,7,8,9,10
		}
	}

	void whileLoop() {
		int i=0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}

	void dowhileLoop() {
		int i=0;
		do{
			System.out.println(i);
			i++;
		} while(i!=10);
	}

	public static void main(String[] args) {
		LoopingStmts obj = new LoopingStmts();
		//obj.forLoop();
		//obj.whileLoop();
		obj.dowhileLoop();
	}

}
