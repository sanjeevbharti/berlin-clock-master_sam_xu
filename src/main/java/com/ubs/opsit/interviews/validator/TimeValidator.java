package com.ubs.opsit.interviews.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class will be used to validation of different components/inputs/fields
 *
 * @author Sanjeev_Bharti
 *
 */
public class TimeValidator implements Validator<String,String>{

	/**
	 * This method will be used to validate input time using regular expression
	 *
	 * @param time Input time in HH:MM:SS format
	 * @return if input time in valid format
	 */
	@Override
	public boolean isValid(String value,String regx) {
		Pattern pattern = Pattern.compile(regx);
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}
}
