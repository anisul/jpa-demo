package com.example.jpademo.type;


import com.example.jpademo.domain.Language;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LanguageConstraintValidator implements ConstraintValidator<ValidLanguage, List<String>> {

    private final List<String> VALID_LANGUAGES = Arrays.stream(Language.values())
            .map(Language::toString)
            .map(String::toLowerCase)
            .collect(Collectors.toList());

    @Override
    public boolean isValid(List<String> objects, ConstraintValidatorContext constraintValidatorContext) {
        return objects.stream().allMatch(item -> VALID_LANGUAGES.contains(item.toLowerCase()));
    }
}
