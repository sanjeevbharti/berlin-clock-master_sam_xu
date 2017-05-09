package com.ubs.opsit.interviews.utils;

import com.ubs.opsit.interviews.constants.ExceptionMessages;
import com.ubs.opsit.interviews.exception.BerlinClockException;

/**
 * Class to maintain application level Utility methods
 *
 * @author Sanjeev_Bharti
 *
 */
public final class SystemUtils {

	private SystemUtils() {

	}

	/**
	 * This method will split HH:MM:SS time format to int array
	 *
	 * @param value  Input time in HH:MM:SS
	 * @param delimiter Time separator ":"
	 * @return int[] index 0 is Hours, index 1 is Minutes and index 2 is Seconds
	 * @throws BerlinClockException
	 */
	public static int[] splitStringToIntArray(String value, String delimiter) throws BerlinClockException {

		String[] stringArr = value.split(delimiter);
		int[] intOutputArr = new int[stringArr.length];
		try{
			for (int i = 0; i < stringArr.length; i++) {
				//Converting String to int
				intOutputArr[i] = Integer.parseInt(stringArr[i]);
			}
		}
		catch (Exception e) {
			throw new BerlinClockException(ExceptionMessages.PARSE_TIME_EXCEPTION);
		}
		return intOutputArr;
	}

}
