package edu.epam.chapterone.variantone.taskfour.report;

public class StringReport {
    public void compareStringReport(String string1 ,String string2, boolean flag){
        System.out.printf("%s and %s equal? : %b%n",string1,string2,flag);
    }

    public void printPasswordLabel(String password){
        System.out.printf("Please enter your password. EXAMPLE : %s%n",password);
    }

    public void printIncorrectPassword(){
        System.out.println("Incorrect password");
    }
}
