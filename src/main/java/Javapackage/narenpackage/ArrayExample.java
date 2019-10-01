package Javapackage.narenpackage;

public class ArrayExample {

    final static String country = "India";

    public static void m1() {

        int[] arr1 = new int[5];
        String[] arr2 = {"a", "b", "c", "d"};
        int j = 0;

        try {
            arr1[0] = 0;
            arr1[1] = 1;
            arr1[2] = 2;
            arr1[3] = 3;
            arr1[4] = 4;
            arr1[5] = 15; // ArrayIndexOutOfBoundsException

            //System.out.println("After 6th element");

            /*try {
                for(int i = 0; i <= 5; i++) {
                    arr1[i] = i;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }*/

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            new CustomException("Actual size of array is 5 but trying to enter more data");
            try {
                for(int i = 0; i <= 5; i++) {
                    arr1[i] = i;
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("I am finally block");
        }

        //System.out.println(arr1[0]);
        //System.out.println(arr1[1]);

		/*for(int i = 0; i < 5; i++) {
			arr1[i] = i;
		}*/

        System.out.println("Number of data is  " + arr1.length);

		/*for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		while(j < arr1.length) {
			System.out.println(arr1[j]);
			j++;
		}*/

        // for each loop
        for (int var : arr1) {
            System.out.println(var);
        }


    }

    public static void m2() throws ArrayIndexOutOfBoundsException {

            int j = 0;
            int[] arr1 = new int[5];

            String[] arr2 = {"a", "b", "c", "d"};

            arr1[0] = 0;
            arr1[1] = 1;
            arr1[2] = 2;
            arr1[3] = 3;
            arr1[4] = 4;
            arr1[5] = 15; // ArrayIndexOutOfBoundsException

            System.out.println("Number of data is  " + arr1.length);

            // for each loop
            for (int var : arr1) {
                System.out.println(var);
            }

    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        ArrayExample obj = new ArrayExample();
       try {
           m1();
           m2();
          // m1();
       } catch (Exception e ) {
           e.printStackTrace();

       } finally {
           obj = null;
           System.gc();
       }
    }


}
