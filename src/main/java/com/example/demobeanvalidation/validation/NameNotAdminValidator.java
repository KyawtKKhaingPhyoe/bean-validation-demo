package com.example.demobeanvalidation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameNotAdminValidator implements ConstraintValidator<NameNotAdmin,String > {

    @Override
    public void initialize(NameNotAdmin constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
        return !name.equalsIgnoreCase("admin");
    }
}
