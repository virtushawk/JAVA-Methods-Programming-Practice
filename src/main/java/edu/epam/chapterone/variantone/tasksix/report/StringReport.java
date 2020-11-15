package edu.epam.chapterone.variantone.tasksix.report;

import edu.epam.chapterone.variantone.tasksix.entity.Person;
import edu.epam.chapterone.variantone.tasksix.entity.Task;

import java.util.Date;

public class StringReport {
    public void taskReport(Person person, Task task){
        System.out.printf("%s : %s",person.toString(),task.toString());
    }
}
