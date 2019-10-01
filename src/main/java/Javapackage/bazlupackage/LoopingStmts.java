package Javapackage.bazlupackage;

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
     *
     * break ::
     * continue ::
     *
     */

    void printm() {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

    }


    void forLoop() {
        // print numbers from 0 to 10

        for (int i = 0; i <= 10; i++) {

            if(i == 5) {
                break;
                //continue;
            }
            System.out.println(i);

        }

        System.out.println("Out of for loop");

    }

    void whileLoop() {

        int i = 0;

        while (i <= 10) {
            i++;
            if(i == 5) {
                //break;
                continue;
            }
            System.out.println(i);


        }
        System.out.println("Out of while loop");

		// infinite while loop

		/*while(true) {
			System.out.println(i); 
			i++; 
		}*/

    }

    void doWhileLoop() {
        int i = 0;
        do {
            i++;
            if(i == 5) {
                //break;
                continue;
            }
            System.out.println(i);
        }
        while (i <= 10);
        System.out.println("Out of do while loop");
    }

    public static void main(String[] args) {
        LoopingStmts obj = new LoopingStmts();
        //obj.forLoop();
        //obj.whileLoop();
        obj.doWhileLoop();
    }
}
