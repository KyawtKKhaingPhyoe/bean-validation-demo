package com.example.demobeanvalidation.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {NameNotAdminValidator.class})
public @interface NameNotAdmin {

    String message() default "Name cant be Admin";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
