package com.github.gforze;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private List<Task> taskList;
    private String projectTitle;

    public Project(String projectTitle) {
        this.taskList = new ArrayList<>();
        if(projectTitle.length() <=0){
            System.out.println("Projecttitle is needed");
        }else{
            this.projectTitle = projectTitle;
        }

    }


    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

     public void addTask(Task t){
        getTaskList().add(t);
     }
     public void removeTask(Task t){
        if (getTaskList().contains(t)){
            getTaskList().remove(t);
        }
        else{
            System.out.println("The task are not in the project");
        }

     }

     public void printProject(){

          String doneStatus;

         for (Task task:getTaskList()){
             if(task.isDone()){
                 doneStatus=" [X]";}
             else{
                 doneStatus=" [ ]";
             }
            System.out.println("Task: " + task.getTaskName() +" Date: " + task.getDate()
                    + doneStatus);
        }
     }
}
