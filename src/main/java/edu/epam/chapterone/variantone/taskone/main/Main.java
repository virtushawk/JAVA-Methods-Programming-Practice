package edu.epam.chapterone.variantone.taskone.main;

import edu.epam.chapterone.variantone.taskone.reader.InputReader;
import edu.epam.chapterone.variantone.taskone.validator.InputValidator;


public class Main {
    public static void main(String[] args) {
            System.out.println("What's your name?");
            InputReader reader = new InputReader();
            String name = reader.readString();
            InputValidator validator = new InputValidator();
            if(validator.validateReadString(name)) {
                System.out.printf("Hello %s%n", name);
            }
            else{
                System.out.println("Error, check your name");
            }
    }
}
