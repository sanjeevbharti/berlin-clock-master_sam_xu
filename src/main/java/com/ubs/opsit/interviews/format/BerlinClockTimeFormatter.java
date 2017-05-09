package com.ubs.opsit.interviews.format;

import com.ubs.opsit.interviews.constants.Constants;
import com.ubs.opsit.interviews.constants.ExceptionMessages;
import com.ubs.opsit.interviews.exception.BerlinClockException;
import com.ubs.opsit.interviews.utils.Color;

public class BerlinClockTimeFormatter implements TimeFormatter {

	/**
	 * Method to display on/off lamps on each row
	 *
	 */
	private String formatRowLamps(String color, int limit, int totalNumOfLamps) {
		StringBuilder rowStr = new StringBuilder(Constants.NEXT_LINE);
		for (int i = 0; i < limit; i++) {
			rowStr.append(color);
		}
		for (int i = 0; i < totalNumOfLamps - limit; i++) {
			rowStr.append(Color.OFF.getValue());
		}
		return rowStr.toString();
	}

	private String formatSecondLamp(int time_seconds) {
		return time_seconds % 2 == 0 ? Color.YELLOW.getValue() : Color.OFF.getValue();
	}

	private int getTopRowHoursLamp(int time_hours) {
		return time_hours / 5;
	}

	private int getBottomRowHoursLamp(int time_hours) {
		return time_hours % 5;
	}

	private int getTopRowMinutesLamp(int time_minutes) {
		return time_minutes / 5;
	}

	private int getBottomRowMinutesLamp(int time_minutes) {
		return time_minutes % 5;
	}

	/**
	 * Method to format the display Berlin Clock timing
	 * @throws BerlinClockException
	 *
	 */
	@Override
	public String formatClockTime(int hours, int minutes, int seconds) throws BerlinClockException {
		StringBuilder berlinTime = new StringBuilder();
		try{
			berlinTime.append(formatSecondLamp(seconds));

			berlinTime.append(formatRowLamps(Color.RED.getValue(), getTopRowHoursLamp(hours), Constants.TOP_HOURS_OFFSET));
			berlinTime.append(formatRowLamps(Color.RED.getValue(), getBottomRowHoursLamp(hours), Constants.BOTTOM_HOURS_OFFSET));
			berlinTime.append(formatRowLamps(Color.YELLOW.getValue(), getTopRowMinutesLamp(minutes), Constants.TOP_MINUTES_OFFSET).replaceAll("YYY","YYR"));
			berlinTime.append(formatRowLamps(Color.YELLOW.getValue(), getBottomRowMinutesLamp(minutes), Constants.BOTTOM_MINUTES_OFFSET));
		}
		catch (Exception e) {
			throw new BerlinClockException(ExceptionMessages.FORMAT_TIME_EXCEPTION);
		}
		return berlinTime.toString();
	}
}
