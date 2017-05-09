package com.ubs.opsit.interviews.constants;

/**
 * This class will maintain all constants used in the application
 *
 * @author Sanjeev_Bharti
 *
 */
public class Constants {

	//Regular expression to check time in HH:MM:SS format
	public final static String INPUT_TIME_PATTERN_HH_MM_SS = "(?:[012]\\d|2[0123]):(?:[012345]\\d):(?:[012345]\\d)";
	public final static String TIME_DELIMITER = ":";
	public final static String NEXT_LINE = System.getProperty("line.separator");
	public final static String COLOR_CODE_RED = "R";
	public final static String COLOR_CODE_YELLOW = "Y";
	public final static String COLOR_CODE_OFF = "O";
	public final static int TOP_HOURS_OFFSET = 4;
	public final static int BOTTOM_HOURS_OFFSET = 4;
	public final static int TOP_MINUTES_OFFSET = 11;
	public final static int BOTTOM_MINUTES_OFFSET = 4;
	public final static String BERLIN_COUNTRY_CODE = "BERLIN";
	public final static String VALIDATOR_FACTORY_CODE_TIME = "TIME";

}
