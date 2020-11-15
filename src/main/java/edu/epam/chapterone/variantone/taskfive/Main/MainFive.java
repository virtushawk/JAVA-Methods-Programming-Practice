package edu.epam.chapterone.variantone.taskfive.Main;

import edu.epam.chapterone.variantone.taskfive.report.NumberReport;
import edu.epam.chapterone.variantone.taskfive.service.NumberService;
import edu.epam.chapterone.variantone.taskfive.service.StringService;
import edu.epam.chapterone.variantone.taskfive.validation.InputValidation;

public class MainFive {
    public static void main(String[] args) {
        InputValidation inputValidation = new InputValidation();
        if(inputValidation.numberValidation(args)){
            StringService stringService = new StringService();
            int [] numbers = stringService.stringToInt(args);
            NumberService numberService = new NumberService();
            int result = numberService.numberSum(numbers);
            NumberReport numberReport = new NumberReport();
            numberReport.resultReport(numbers,result);
            result = numberService.numberMultiplication(numbers);
            numberReport.resultReport(numbers,result);
        }
        else {
            System.out.println("Wrong arguments");
        }
    }
}
