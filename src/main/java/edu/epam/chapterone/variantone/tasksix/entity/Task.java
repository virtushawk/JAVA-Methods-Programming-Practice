package edu.epam.chapterone.variantone.tasksix.entity;

import java.util.Date;

public class Task {
    private Date gotTask;
    private Date finishedTask;

    public Task(Date gotTask) {
        this.gotTask = gotTask;

    }

    public Date getGotTask() {
        return gotTask;
    }

    public void setGotTask(Date gotTask) {
        this.gotTask = gotTask;
    }

    public Date getFinishedTask() {
        return finishedTask;
    }

    public void setFinishedTask(Date finishedTask) {
        this.finishedTask = finishedTask;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Task{");
        sb.append("gotTask=").append(gotTask);
        sb.append(", finishedTask=").append(finishedTask);
        sb.append('}');
        return sb.toString();
    }
}
