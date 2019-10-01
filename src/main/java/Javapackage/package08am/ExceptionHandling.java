package Javapackage.package08am;

public class ExceptionHandling {

    public static void main(String[] args) throws InterruptedException, ArrayIndexOutOfBoundsException, NullPointerException {

        int j = 0;
        int[] arr1 = new int[5];

        String[] arr2 = {"a0@","b1@","c#3","d$4"};

		try {
            arr1[0] = 0;
            arr1[1] = 1;
            arr1[2] = 2;
            arr1[3] = 3;
            arr1[4] = 4;
            arr1[5] = 15; // ArrayIndexOutOfBoundsException
            try {

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
		    new CustomException();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            try {

            }catch (Exception e1) {
                e1.printStackTrace();
            }
        }

		/*System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);*/


        // inserting data into arr1

        /*for(int i = 0; i < arr1.length; i++) {
            arr1[i] = i; // 0,1,2,3,4
        }*/

        Thread.sleep(5000);

        System.out.println("Number of data in arr1 is :: "+arr1.length);  // 5

        // retrieving data into arr1

		/*for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}*/

		/*while(j < arr1.length) {
			System.out.println(arr1[j]);
			j++;
		}*/

        // for each loop
        for(int var : arr1) {
            System.out.println(var);
        }

    }

}
