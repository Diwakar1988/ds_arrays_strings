package com.github.diwakar1988.array;

import java.util.Arrays;

public class ArrayUtils {

	// use XOR approach
	public static int countOddOccurrence(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = count ^ arr[i];
		}
		return count;
	}

	/**
	 * program to find the sum of contiguous sub-array within a one-dimensional
	 * array of numbers which has the largest<BR>
	 * sum using Kadane’s Algorithm.
	 */
	public static int getMaxSubArraySum(int arr[]) {
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < arr.length; i++) {
			max_ending_here = max_ending_here + arr[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}

	public static void sortBinaryArray(int arr[]) {

		// Method 1 (Count 0s or 1s)
		// Thanks to Naveen for suggesting this method.
		// 1) Count the number of 0s. Let count be C.
		// 2) Once we have count, we can put C 0s at the beginning and 1s at the
		// remaining n – C positions in array.
		//
		// Time Complexity : O(n)

		// Method 2 (Use two indexes to traverse)
		// Maintain two indexes. Initialize first index left as 0 and second
		// index right as n-1.
		//
		// Do following while left < right
		// a) Keep incrementing index left while there are 0s at it
		// b) Keep decrementing index right while there are 1s at it
		// c) If left < right then exchange arr[left] and arr[right]
		int left = 0, right = arr.length - 1;

		while (left < right) {
			/* Increment left index while we see 0 at left */
			while (arr[left] == 0 && left < right)
				left++;

			/* Decrement right index while we see 1 at right */
			while (arr[right] == 1 && left < right)
				right--;

			/*
			 * If left is smaller than right then there is a 1 at left and a 0
			 * at right. Exchange arr[left] and arr[right]
			 */
			if (left < right) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
	}

	public static int getMajorityElement(int arr[]) {
		//Using Moore’s Voting Algorithm
		//STEP-1: find a candidate
		//STEP-2: count candidate if its > arr.length/2 then the candidate will be in majority
		int candidate = findCandidate(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==candidate) {
				count++;
			}
		}
		if (count>(arr.length/2)) {
			return candidate;
		}
		return -1;
	}

	private static int findCandidate(int[] arr) {
		int count = 0;
		int major=0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[major]==arr[i]) {
				count++;
			}
			else {
				count--;
			}
			if (count<0) {
				major=i;
				count=1;
			}
		}
		return arr[major];
	}

	public static int getMajorityElementInSortedArray(int arr[]) {
		return 0;

	}

	public static boolean hasPairSum(int arr[], int sum) {
		//METHOD-1
		// 1) Sort the array in non-decreasing order.
		// 2) Initialize two index variables to find the candidate
		// elements in the sorted array.
		////// (a) Initialize first to the leftmost index: l = 0
		////// (b) Initialize second the rightmost index: r = ar_size-1
		// 3) Loop while l < r.
		////// (a) If (A[l] + A[r] == sum) then return 1
		////// (b) Else if( A[l] + A[r] < sum ) then l++
		////// (c) Else r--
		// 4) No candidates in whole array - return 0
		Arrays.sort(arr);
		/*
		 * Now look for the two candidates in the sorted array
		 */
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			if (arr[l] + arr[r] == sum)
				return true;
			else if (arr[l] + arr[r] < sum)
				l++;
			else // A[i] + A[j] > sum`
				r--;
		}
		return false;
		
		//METHOD-2: store compliments and search for the some in O(n) TIME and O(n) space;
	}

}
