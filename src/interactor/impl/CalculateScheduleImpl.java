package interactor.impl;

import java.time.LocalDate;
import java.util.List;

import interactor.CalculateSchedule;
import main.Task;

public class CalculateScheduleImpl implements CalculateSchedule {

	@Override
	public void execute(List<Task> tasks) {
		for (Task task : tasks) {
			LocalDate maxEndDate = LocalDate.now();
	        for (Task dependency : task.dependencies) {
	            if (dependency.endDate.isAfter(maxEndDate)) {
	                maxEndDate = dependency.endDate;
	            }
	        }
	 
	        task.startDate = maxEndDate.plusDays(1);
	        task.endDate = task.startDate.plusDays(task.daysDuration);
		}
	}

}
