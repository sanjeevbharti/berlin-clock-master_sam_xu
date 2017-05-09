package com.ubs.opsit.interviews.format;

import org.junit.Assert;
import org.junit.Test;

public class BerlinClockTimeFormatterTest {

	TimeFormatter timeFormatter = new BerlinClockTimeFormatter();

	@Test
	public void testFormatClockTime() throws Exception {
		Assert.assertEquals("O" + System.lineSeparator() + "RROO" + System.lineSeparator() + "ROOO"
				+ System.lineSeparator() + "YYOOOOOOOOO" + System.lineSeparator() + "YYOO",
				timeFormatter.formatClockTime(11, 12, 13));
	}

}
