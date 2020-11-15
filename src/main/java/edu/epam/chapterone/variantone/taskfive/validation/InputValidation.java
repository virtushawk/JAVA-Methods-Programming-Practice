package edu.epam.chapterone.variantone.taskfive.validation;

import edu.epam.chapterone.variantone.taskfive.constants.Constants;

public class InputValidation {
    public boolean numberValidation(String [] args){
        boolean flag = true;
        for (String arg: args) {
            if (!arg.matches(Constants.NUMBER_REGEX)) {
               flag = false;
            }
        }
        return flag;
    }
}
