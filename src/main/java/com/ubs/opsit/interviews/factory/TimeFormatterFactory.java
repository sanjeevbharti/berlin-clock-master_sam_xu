package com.ubs.opsit.interviews.factory;

import com.ubs.opsit.interviews.constants.Constants;
import com.ubs.opsit.interviews.format.BerlinClockTimeFormatter;
import com.ubs.opsit.interviews.format.TimeFormatter;

/**
 * Factory method for TimeFormatter
 *
 * @author Sanjeev_Bharti
 *
 */
public class TimeFormatterFactory {

	public TimeFormatter getTimeFormatter(String countryCode)
	{
		if (countryCode == null) {
			return null;
		}
		if (countryCode.equalsIgnoreCase(Constants.BERLIN_COUNTRY_CODE)) {
			return new BerlinClockTimeFormatter();
		}
		return null;
	}

}
