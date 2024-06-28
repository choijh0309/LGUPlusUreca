package basic.binarysearch;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		//  index  :    0    1    2    3    4
		//  {     -1  -2   
		int[] arr = {1, 3, 5, 7, 9};
		System.out.println(Arrays.binarySearch(arr, 1)); // 0
		System.out.println(Arrays.binarySearch(arr, 2)); // -2  
		System.out.println(Arrays.binarySearch(arr, 0)); // -1

	}

}
