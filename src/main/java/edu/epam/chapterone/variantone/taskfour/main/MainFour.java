package edu.epam.chapterone.variantone.taskfour.main;

import edu.epam.chapterone.variantone.taskfour.reader.InputReader;
import edu.epam.chapterone.variantone.taskfour.report.StringReport;
import edu.epam.chapterone.variantone.taskfour.validator.InputValidator;

public class MainFour {
    public static void main(String[] args) {
        StringReport stringReport = new StringReport();
        String password = "123456";
        stringReport.printPasswordLabel(password);
        InputReader inputReader = new InputReader();
        String userPassword = inputReader.readString();
        InputValidator inputValidator = new InputValidator();
        if (inputValidator.isPassword(userPassword)){
            stringReport.compareStringReport(password,userPassword, inputValidator.isPassword(userPassword));
        }
        else {
            stringReport.printIncorrectPassword();
        }
    }
}
