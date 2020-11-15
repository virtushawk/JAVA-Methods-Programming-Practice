package edu.epam.chapterone.variantone.taskone.validator;

import edu.epam.chapterone.variantone.taskone.constants.Constants;

public class InputValidator {
    public boolean validateReadString(String name){
        return name.matches(Constants.NAME_REGEX);
    }
}
