package com.ubs.opsit.interviews.utils;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.exception.BerlinClockException;

/**
 * Test class to check different utility function in the application
 *
 * @author Sanjeev_Bharti
 *
 */
public class SystemUtilsTest {

	@Test
	public void testSplitStringToIntArray() throws BerlinClockException {

		int[] intArr = SystemUtils.splitStringToIntArray("11,12", ",");
		Assert.assertEquals(11, intArr[0]);
		Assert.assertEquals(12, intArr[1]);
	}

	/**
	 * This test method will throw exception as it trying to convert Empty
	 * string to int.
	 *
	 * @throws BerlinClockException
	 */
	@Test(expected = BerlinClockException.class)
	public void testSplitStringToIntArray_EmptyValue_Exception() throws BerlinClockException {

		int[] intArr = SystemUtils.splitStringToIntArray(",12", ",");
		Assert.assertEquals(11, intArr[0]);
		Assert.assertEquals(12, intArr[1]);
	}

	@Test(expected = BerlinClockException.class)
	public void testSplitStringToIntArray_InvalidValue_Exception() throws BerlinClockException {

		int[] intArr = SystemUtils.splitStringToIntArray("11a,12", ",");
		Assert.assertEquals(11, intArr[0]);
		Assert.assertEquals(12, intArr[1]);
	}
}
