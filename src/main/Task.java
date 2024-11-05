package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task {
	String name;
	public int daysDuration;
	public LocalDate startDate;
	public LocalDate endDate;
	public List<Task> dependencies;
	
	public Task(String name, int daysDuration) {
		this.name = name;
		this.daysDuration = daysDuration;
		this.dependencies = new ArrayList<>();
	}
	
	public void addDependency(Task dependency) {
		this.dependencies.add(dependency);
	}
}
