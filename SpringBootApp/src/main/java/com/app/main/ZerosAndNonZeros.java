package com.app.main;

import java.util.Arrays;

public class ZerosAndNonZeros {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 0, 3, 0, 21, 0 };

		int counter = 0;

		// Traversing inputArray from left to right

		for (int i = 0; i < arr.length; i++) {
			// If inputArray[i] is non-zero

			if (arr[i] != 0) {
				// Assigning inputArray[i] to inputArray[counter]

				arr[counter] = arr[i];

				// Incrementing the counter by 1

				counter++;
			}
		}

		// Assigning zero to remaining elements

		while (counter < arr.length) {
			arr[counter] = 0;

			counter++;
		}

		System.out.println(Arrays.toString(arr));

	}
}