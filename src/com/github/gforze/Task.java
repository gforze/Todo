package com.github.gforze;

import java.util.Date;

public class Task {


    private Project project;
    private String taskName;
    private Date date;
    private boolean done;

    public Task(Project project, String taskName, Date date) {
        this.project = project;
        this.taskName = taskName;
        this.date = date;
        this.done = false;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTask(String taskName) {
        this.taskName = taskName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
