package com.ubs.opsit.interviews.validator;

public interface Validator<T, O> {
	boolean isValid(T value, O toValidate);
}