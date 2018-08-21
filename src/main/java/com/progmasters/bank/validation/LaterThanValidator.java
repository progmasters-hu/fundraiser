package com.progmasters.bank.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.progmasters.bank.config.SpringWebConfig;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class LaterThanValidator implements ConstraintValidator<LaterThan, LocalDate> {
    LocalDate date;

    @Override
    public void initialize(LaterThan constraintAnnotation) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(SpringWebConfig.DATE_FORMAT);
        this.date = LocalDate.parse(constraintAnnotation.value(), formatter);
    }

    @Override
    public boolean isValid(LocalDate dateToValidate, ConstraintValidatorContext constraintContext) {
        if (dateToValidate == null) {
            return true;
        }

        if (dateToValidate.isBefore(date)) {
            return false;
        } else {
            return true;
        }
    }
}
