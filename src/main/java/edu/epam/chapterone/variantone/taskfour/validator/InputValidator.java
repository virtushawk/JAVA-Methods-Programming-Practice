package edu.epam.chapterone.variantone.taskfour.validator;

import edu.epam.chapterone.variantone.taskfour.constants.Constants;

public class InputValidator {
    public boolean isPassword(String password){
        return password.matches(Constants.PASSWORD_REGEX);
    }
}
