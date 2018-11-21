package com.github.gforze;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    private List<Project> projectList;

    public ToDo(List<Project> projectList) {
        this.projectList = new ArrayList<>();
        DataHandler dh = new DataHandler();
        dh.getDataFromFile();
        this.projectList.addAll(dh.data);
    }

    public void startApp(){
        while(true){
            String cmd;
            String [] arguments;
            Scanner input = new Scanner(System.in);

            cmd = input.nextLine();
            System.out.println(cmd);

            if(cmd.contains(" ")){
                arguments = cmd.split(" ");

            }else{
                arguments = new String[1];
                arguments[0]= cmd;
            }

             int argLength = arguments.length;


            if(argLength>0 && argLength<=3){
                switch(arguments[0]){
                    case "test":
                        System.out.println("Testing");
                        break;

                    case "todo":
                        projectList.add(new Project("Test"));
                        projectList.get(0).addTask(new Task(new Project("test"), "Test123", new Date()));
                        System.out.println("new Object");
                        break;

                    case "p":
                        printProjects();
                        System.out.println("print");
                        break;

                    case "help":
                        help();
                        break;
                        
                    case "q":
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Default");
                        break;

                }
            }

        }



    }
    public void printProjects(){
        for (Project p:projectList){
            System.out.println(p.getProjectTitle());
        }
    }

    public void help(){
        System.out.println("Printing instructions");
    }

}
