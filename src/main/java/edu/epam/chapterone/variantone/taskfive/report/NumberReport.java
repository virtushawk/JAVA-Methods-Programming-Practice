package edu.epam.chapterone.variantone.taskfive.report;

import java.util.Arrays;

public class NumberReport {
    public void resultReport(int [] numbers, int result){
        System.out.printf("%s : %d%n", Arrays.toString(numbers),result);
    }
}
