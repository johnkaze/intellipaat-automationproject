package Javapackage.package07AM;

public class ArrayExample {
	/*
	 * Array :: To store multiple data.
	 * on the basis index.
	 * 
	 * Syntax :: 
	 * 
	 * datatype []nameofarray = new datatype[size];
	 * 
	 * datatype[] nameofarray;
	 * 
	 * nameofarray = new datatype[size];
	 * 
	 * 
	 * datatype[] nameofarray = {1,2,3,4,5,6,7};
	 * 
	 * Once we declare an array with some size, its size cannot be changed.
	 * 
	 * Index of the first element is 0;
	 * 
	 * Index of the last element size-1;
	 * 
	 * 
	 * 
	 * arr[index] = value;
	 * 
	 * 
	 */

	int[] arr1 = new int[5]; // size of the array = number of elements in the array = 5
	int [] arr2 = new int[5];
	int []arr3 = new int[5];
	int arr4[] = new int[5];
	int[] arr5 = {1,2,3,4,5,6};
	
	static String[] arr7 = new String[5];
	String[] arr8 = {"a","b","c","d"};
	
	static int[] arr6;

	public static void main(String[] args) {

		arr6 = new int[5];

		arr6[0] = 1;
		arr6[1] = 2;
		arr6[2] = 3;
		arr6[3] = 4;
		arr6[4] = 5;
		//arr6[5] = 6; // ArrayIndexOutofBoundsException
		
		arr7[0] = "a";
		arr7[1] = "b";
		arr7[2] = "c";
		arr7[3] = "d";
		arr7[4] = "e";

		int size = arr6.length;
		System.out.println("Number of elements in arr6 are :: "+size);

		/*
		 * for(int i = 0; i < size; i++) { System.out.println(arr6[i]); }
		 */

		/*
		 * // for each loop 
		 * for(int ele : arr6) { System.out.println(ele); }
		 */
		

	}
	
	public void m1() {
		System.out.println("Array example class m1 method");
	}






}
