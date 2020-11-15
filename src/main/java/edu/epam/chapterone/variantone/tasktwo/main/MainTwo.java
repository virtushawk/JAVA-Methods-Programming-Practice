package edu.epam.chapterone.variantone.tasktwo.main;

public class MainTwo {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--){
            System.out.printf("%s%n",args[i]);
        }
    }
}
