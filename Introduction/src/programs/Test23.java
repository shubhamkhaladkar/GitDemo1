package programs;

import java.util.Arrays;
import java.util.Collections;

public class Test23 {
	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 67, 7, 12, 44, 6, 67, 78 };

		System.out.println(arr[1]);

		System.out.println("------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

		System.out.println("----------------");

		Arrays.sort(arr);
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		
	

	

	

	}
}
