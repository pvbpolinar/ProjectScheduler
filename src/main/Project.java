package main;

import java.util.ArrayList;
import java.util.List;

import interactor.CalculateSchedule;

public class Project {
	String name;
	private List<Task> tasks;
	
	private final CalculateSchedule calculateSchedule;

    public Project(String name, CalculateSchedule calculateSchedule) {
    	this.name = name;
        this.tasks = new ArrayList<>();
        this.calculateSchedule = calculateSchedule;
        
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void generateSchedule() {
    	calculateSchedule.execute(tasks);
    }
    
    public void printSchedule() {
        for (Task task : tasks) {
            System.out.println("Task: " + task.name + 
                               ", Start Date: " + task.startDate + 
                               ", End Date: " + task.endDate);
        }
    }
}
