package com.dneves.taskmanager.facade;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dneves.taskmanager.model.Task;
import com.dneves.taskmanager.service.TaskService;

import java.util.List;

@Component
public class TaskFacade {

    @Autowired
    private TaskService taskService;

    public List<Task> getAllTasks() {
        return taskService.findAllTasks();
    }

    public Task createTask(Task task) {
        return taskService.saveTask(task);
    }

	public Object getTaskService() {
		// TODO Auto-generated method stub
		return null;
	}
}
