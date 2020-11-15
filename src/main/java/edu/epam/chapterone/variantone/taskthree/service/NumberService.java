package edu.epam.chapterone.variantone.taskthree.service;

import java.util.Random;

public class NumberService {

    public static final Random random = new Random();

    public int generateInt(){
        return   random.nextInt(1000);
    }

}
