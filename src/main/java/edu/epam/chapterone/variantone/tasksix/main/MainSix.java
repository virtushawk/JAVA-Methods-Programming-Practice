package edu.epam.chapterone.variantone.tasksix.main;

import edu.epam.chapterone.variantone.tasksix.entity.Person;
import edu.epam.chapterone.variantone.tasksix.entity.Task;
import edu.epam.chapterone.variantone.tasksix.report.StringReport;

import java.util.Date;

public class MainSix {
    public static void main(String[] args) {
        Person person = new Person("Steve");
        Task task = new Task(new Date());
        StringReport stringReport = new StringReport();
        stringReport.taskReport(person,task);
    }
}
