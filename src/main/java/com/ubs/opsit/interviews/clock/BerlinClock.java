package com.ubs.opsit.interviews.clock;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.constants.Constants;
import com.ubs.opsit.interviews.constants.ExceptionMessages;
import com.ubs.opsit.interviews.exception.BerlinClockException;
import com.ubs.opsit.interviews.factory.TimeFormatterFactory;
import com.ubs.opsit.interviews.factory.ValidatorFactory;
import com.ubs.opsit.interviews.format.TimeFormatter;
import com.ubs.opsit.interviews.utils.SystemUtils;
import com.ubs.opsit.interviews.validator.Validator;

/**
 * The Berlin Clock is an utility to convert time in Berlin Uhr (Clock) Format.
 * It takes input in HH:MM:SS format
 *
 * @author Sanjeev_Bharti
 *
 */
public class BerlinClock implements TimeConverter {

	/*
	 * Implementation method of TimeConvertor. User need to call this method to
	 * get their time in Berlin Uhr (Clock) Format.
	 *
	 * @param inputTime Input time String in HH:MM:SS format
	 *
	 * @return String Output time in Berlin Uhr (Clock) Format
	 */
	@Override
	public String convertTime(String inputTime) throws Exception {

		Validator timeValidator = new ValidatorFactory().getValidator(Constants.VALIDATOR_FACTORY_CODE_TIME);
		TimeFormatter timeFormatter = new TimeFormatterFactory().getTimeFormatter(Constants.BERLIN_COUNTRY_CODE);
		if (!timeValidator.isValid(inputTime, Constants.INPUT_TIME_PATTERN_HH_MM_SS)) {
			throw new BerlinClockException(ExceptionMessages.VALIDATOR_EXCEPTION);
		}

		int[] splitTime = SystemUtils.splitStringToIntArray(inputTime, Constants.TIME_DELIMITER);

		return timeFormatter.formatClockTime(splitTime[0], splitTime[1], splitTime[2]);
	}

}
