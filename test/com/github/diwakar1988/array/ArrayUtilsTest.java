package com.github.diwakar1988.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsTest {

	@Test
	public void testCountOddOccurrence() {
		Assert.assertTrue(ArrayUtils.countOddOccurrence(new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2})==5);
	}
	@Test
	public void testGetMaxSubArraySumUsingKadane() {
		Assert.assertEquals(7,ArrayUtils.getMaxSubArraySum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
		Assert.assertEquals(10,ArrayUtils.getMaxSubArraySum(new int[]{1,2,3,1,2,1}));
	}
	@Test
	public void testSortBinaryArray() {
		int arr[] = new int[]{0, 1, 0, 1, 1, 1};
		ArrayUtils.sortBinaryArray(arr);
		Assert.assertTrue(Arrays.equals(new int[]{0, 0,1,1,1,1},arr));
	}
	@Test
	public void testGetMajorityElement(){
		Assert.assertEquals(3,ArrayUtils.getMajorityElement(new int[]{1, 3, 3, 1, 3}));
		Assert.assertEquals(-1,ArrayUtils.getMajorityElement(new int[]{1, 3, 3, 1, 2}));	
	}
	@Test
	public void testHasPairOfSum(){
		Assert.assertTrue(ArrayUtils.hasPairSum(new int[]{10,2,7,4,9},19));
		Assert.assertFalse(ArrayUtils.hasPairSum(new int[]{10,2,7,4,9},21));
	}
}
