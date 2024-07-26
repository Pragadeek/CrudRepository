package com.app.main;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		
		int[] inputArray={45, 84, 101, 62, 12, 45};
		int pos;
		int temp;

		for (int i = 0; i < inputArray.length - 1; i++)
        {
            pos = i;
 
            //finding the position of smallest element between (i+1)th element and last element
 
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[j] < inputArray[pos] )
                {
                    pos = j;
                }
            }
 
            //Swapping inputArray[i] and inputArray[pos]
 
            temp = inputArray[i];
 
            inputArray[i] = inputArray[pos];
 
            inputArray[pos] = temp;
        }
		System.out.println(Arrays.toString(inputArray));
	}

}
