package com.github.diwakar1988.array;

public class ArrayUtils {

	//
	public static int countOddOccurrence(int arr[]) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			count= count ^ arr[i];
		}
		return count;
	}
	/**
	 * program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum using Kadane’s Algorithm.
	 */
	public static int getMaxSubArraySum(int arr[])
	{
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < arr.length; i++)
		{
			max_ending_here = max_ending_here + arr[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
	
}
