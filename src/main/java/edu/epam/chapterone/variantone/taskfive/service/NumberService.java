package edu.epam.chapterone.variantone.taskfive.service;

public class NumberService {
    public int numberSum(int [] numbers){
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        return sum;
    }

    public int numberMultiplication(int [] numbers){
        int sum = 1;
        for (int number: numbers) {
            sum *= number;
        }
        return sum;
    }
}
