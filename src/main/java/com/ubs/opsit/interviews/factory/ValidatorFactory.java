package com.ubs.opsit.interviews.factory;

import com.ubs.opsit.interviews.constants.Constants;
import com.ubs.opsit.interviews.validator.TimeValidator;
import com.ubs.opsit.interviews.validator.Validator;

/**
 * Factory method for Validator
 *
 * @author Sanjeev_Bharti
 *
 */
public class ValidatorFactory {

	public Validator getValidator(String validatorType) {

		if (validatorType == null) {
			return null;
		}
		if (validatorType.equalsIgnoreCase(Constants.VALIDATOR_FACTORY_CODE_TIME)) {
			return new TimeValidator();
		}
		return null;
	}

}
