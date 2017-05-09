package com.ubs.opsit.interviews.utils;

/**
 * Enum class to maintain list of color
 * 
 * @author Sanjeev_Bharti
 *
 */
public enum Color {
	
	RED("R"),
	YELLOW("Y"),
	OFF("O");
	
	private String value;
	
	private Color(String val){
		value = val;
	}
	
	public String getValue() {
        return value;
    }

}
