package Javapackage.navathapackage;

import java.io.OutputStream;

public class ArrayExample {

    final static String country = "India";

    static OutputStream out;


    public static void m1() throws InterruptedException {

        int[] arr1 = new int[5];

        String[] arr2 = {"a", "b", "c", "d"};

        /*arr1[0] = 10;
        arr1[1] = 11;
        arr1[2] = 12;
        arr1[3] = 13;
        arr1[4] = 14;
        arr1[5] = 15; // ArrayIndexOutOfBoundsException*/

        try {
            arr1[0] = 10;
            arr1[1] = 11;
            arr1[2] = 12;
            arr1[3] = 13;
            arr1[4] = 14;
            arr1[5] = 15; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            try {
                throw new CustomException("Trying to insert data more than specified size of array");
            } catch (CustomException ex) {
                ex.printStackTrace();
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //System.out.println("After 6th element");

        //System.out.println(arr1[0]);
        //System.out.println(arr1[1]);

        Thread.sleep(15000);

        System.out.println("Number of data is  " + arr1.length);

       /* for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        } */

        // for each loop
        for (int data : arr1) {
            System.out.println(data);
        }


    }


    public static void main(String[] args) throws InterruptedException {
        ArrayExample obj = new ArrayExample();
        m1();
    }


}
