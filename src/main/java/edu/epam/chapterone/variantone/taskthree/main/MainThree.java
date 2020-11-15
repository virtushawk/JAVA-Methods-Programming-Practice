package edu.epam.chapterone.variantone.taskthree.main;

import edu.epam.chapterone.variantone.taskthree.report.NumberReport;
import edu.epam.chapterone.variantone.taskthree.service.NumberService;

public class MainThree {

    public static void main(String[] args) {
        int numberOfCounts = 3;
        NumberService numberService = new NumberService();
        NumberReport numberReport = new NumberReport();
        for (int i = 0; i < numberOfCounts; i++) {
            int number = numberService.generateInt();
            numberReport.generateIntReportLine(number);
            numberReport.generateIntReport(number);
        }
    }

}
