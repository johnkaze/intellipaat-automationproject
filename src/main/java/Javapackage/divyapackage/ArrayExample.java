package Javapackage.divyapackage;


import Javapackage.dbconnectivity.CustomException;

public class ArrayExample {
    /*
     * Array :: To store multiple data on the basis index.
     *
     * Syntax ::
     *
     * datatype[] nameofarray = new datatype[size];
     *
     * datatype[] nameofarray;
     *
     * nameofarray = new datatype[size];
     *
     * datatype[] nameofarray = {1,2,3,4,5,6,7};
     *
     * Once we declare an array with some size, its size cannot be changed.
     *
     * Index of the first element is 0;
     *
     * Index of the last element size-1;
     *
     * nameofarray[index] = value;
     *
     * for each loop ::
     *
     */

    int[] arr1 = new int[5]; // size of the array = number of elements in the array = 5
    int[] arr2 = new int[5];
    int[] arr3 = new int[5];
    int arr4[] = new int[5];
    int[] arr5 = {1, 2, 3, 4, 5, 6};

    static String[] arr7 = new String[5];
    String[] arr8 = {"a", "b", "c", "d"};

    static int[] arr6;

    final static String country = "India";

    public static void main(String[] args) throws InterruptedException,ArrayIndexOutOfBoundsException {

       // country = "Usa";

        arr6 = new int[5];

        arr6[0] = 1;
        arr6[1] = 2;
        arr6[2] = 3;
        arr6[3] = 4;
        arr6[4] = 5;
        //arr6[5] = 6; // ArrayIndexOutOfBoundsException

        Thread.sleep(5000);

        try {
            arr6[0] = 1;
            arr6[1] = 2;
            arr6[2] = 3;
            arr6[3] = 4;
            arr6[4] = 5;
            arr6[5] = 6; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            try {
                throw new CustomException("Trying to add elements more than declared size of array");
            } catch (CustomException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block");
        }

        arr7[0] = "a";
        arr7[1] = "b";
        arr7[2] = "c";
        arr7[3] = "d";
        //arr7[4] = "e";

        int size = arr6.length;
        System.out.println("Number of elements in arr6 are :: " + size);

        for (int i = 0; i < arr6.length; i++) {
            System.out.println(arr6[i]);
        }

        int size7 = arr7.length;
        System.out.println("Number of elements in arr7 are :: " + size7);

        for (int i = 0; i < arr7.length; i++) {
            System.out.println(arr7[i]);
        }

        // for each loop

        for (int ele : arr6) {
            System.out.println(ele);
        }


    }

    public void finalize() throws InterruptedException {
        System.out.println("finalize method overriden");
        arr1 = null;
        System.gc();

        Thread.sleep(5000);
    }


}
