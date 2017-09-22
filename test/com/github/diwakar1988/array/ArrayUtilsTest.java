package com.github.diwakar1988.array;

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
}
