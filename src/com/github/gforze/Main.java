package com.github.gforze;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Project p = new Project("Test");

	    p.addTask(new Task(p, "Do some testing", new Date()));
        p.addTask(new Task(p, "Do some testing2", new Date()));

        p.printProject();
        List projectList = new ArrayList();
        projectList.add(p);
        ToDo t = new ToDo(projectList);
        t.startApp();


    }
}
