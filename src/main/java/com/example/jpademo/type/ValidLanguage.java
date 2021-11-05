package com.example.jpademo.type;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = LanguageConstraintValidator.class)
public @interface ValidLanguage {
    String message() default "wrong language";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
