package com.ubs.opsit.interviews.clock;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.exception.BerlinClockException;

public class BerlinClockTest {

	TimeConverter berlinClock = new BerlinClock();

	@Test
	public void testConvertTime() throws Exception {
		Assert.assertEquals("O" + System.lineSeparator() + "RROO" + System.lineSeparator() + "ROOO"
				+ System.lineSeparator() + "YYOOOOOOOOO" + System.lineSeparator() + "YYOO",
				berlinClock.convertTime("11:12:13"));
	}

	@Test(expected = BerlinClockException.class)
	public void testConvertTime_InvalidTime_Exception() throws Exception {
		Assert.assertEquals("O" + System.lineSeparator() + "RROO" + System.lineSeparator() + "ROOO"
				+ System.lineSeparator() + "YYOOOOOOOOO" + System.lineSeparator() + "YYOO",
				berlinClock.convertTime("11a:12:13"));
	}

	@Test(expected = BerlinClockException.class)
	public void testConvertTime_Empty_HH_Exception() throws Exception {
		Assert.assertEquals("O" + System.lineSeparator() + "RROO" + System.lineSeparator() + "ROOO"
				+ System.lineSeparator() + "YYOOOOOOOOO" + System.lineSeparator() + "YYOO",
				berlinClock.convertTime(":12:13"));
	}

}
