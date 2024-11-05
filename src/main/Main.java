package main;

import interactor.CalculateSchedule;
import interactor.impl.CalculateScheduleImpl;

public class Main {

	public static void main(String[] args) {
		CalculateSchedule calculateSchedule = new CalculateScheduleImpl();
		Project project = new Project("System Development", calculateSchedule);

        Task task1 = new Task("Design", 5);
        Task task2 = new Task("Development", 10);
        Task task3 = new Task("Testing", 3);
        Task task4 = new Task("Deployment", 4);

        task2.addDependency(task1);
        task3.addDependency(task2);
        task4.addDependency(task3);

        project.addTask(task1);
        project.addTask(task2);
        project.addTask(task3);
        project.addTask(task4);

        project.generateSchedule();
        project.printSchedule();
	}

}
