package com.ubs.opsit.interviews.validator;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.constants.Constants;

/**
 * Test class for input time validation
 *
 * @author Sanjeev_Bharti
 *
 */
public class TimeValidatorTest {

	Validator timeValidator = new TimeValidator();
	String regExp = Constants.INPUT_TIME_PATTERN_HH_MM_SS;

	@Test
	public void testValidateTime() {
		Assert.assertEquals(true, timeValidator.isValid("11:12:13",regExp));
	}

	@Test
	public void testValidateTime_Midnight() {
		Assert.assertEquals(true, timeValidator.isValid("24:00:00",regExp));
	}

	@Test
	public void testValidateTime_Invalid_HH() {
		Assert.assertEquals(false, timeValidator.isValid("11a:12:13",regExp));
	}

	@Test
	public void testValidateTime_Invalid_MM() {
		Assert.assertEquals(false, timeValidator.isValid("11:12a:13",regExp));
	}

	@Test
	public void testValidateTime_Invalid_SS() {
		Assert.assertEquals(false, timeValidator.isValid("11:12:13a",regExp));
	}

	@Test
	public void testValidateTime_Outound_HH() {
		Assert.assertEquals(false, timeValidator.isValid("111:12:13",regExp));
	}

	@Test
	public void testValidateTime_Outound_MM() {
		Assert.assertEquals(false, timeValidator.isValid("11:121:13",regExp));
	}

	@Test
	public void testValidateTime_Outound_SS() {
		Assert.assertEquals(false, timeValidator.isValid("11:12:131",regExp));
	}

	@Test
	public void testValidateTime_InvalidFormat() {
		Assert.assertEquals(false, timeValidator.isValid("1112:13a",regExp));
	}

}
