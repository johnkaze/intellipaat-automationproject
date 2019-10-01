package Javapackage.package09AM;

public class ArrayExample {
	/*
	 * Array :: 
	 * 
	 * Data can be stored on the basis of index.
	 * 
	 * 0, number of element -  1;
	 * 
	 * Sysntax :: 
	 * 
	 * datatype[] name = new datatype[size];
	 * 
	 * datatype[] name;
	 * 
	 * name = new datatype[size];
	 * 
	 * datatype[] name = {1,2,3,4,5,6};
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		String[] arr1 = new String[5];
		
		arr1[0]="Sunday";
		arr1[1]="Monday";
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
				
		System.out.println(arr.length); //5
		
		for(int i = 0; i <= 4; i++) {
			if(i == 3) {
				System.out.println();
				continue;
				
			}
			System.out.println(arr[i]);
		}
		
		System.out.println("out of for loop");
		
		
		
	}
	

}
