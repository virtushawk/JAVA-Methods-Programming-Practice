package edu.epam.chapterone.variantone.taskfive.service;

public class StringService {
    public int stringToInt(String number){
        return Integer.parseInt(number);
    }

    public int [] stringToInt(String [] numbers){
        int [] result = new int[numbers.length];
        for (int i = 0;i < numbers.length;i++){
            result[i] = Integer.parseInt(numbers[i]);
        }
        return result;
    }
}
