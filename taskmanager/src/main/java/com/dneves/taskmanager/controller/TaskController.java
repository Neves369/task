package com.dneves.taskmanager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  com.dneves.taskmanager.facade.TaskFacade;
import com.dneves.taskmanager.model.Task;
import com.dneves.taskmanager.service.strategy.ByCreationDateStrategy;
import com.dneves.taskmanager.service.strategy.ByPriorityStrategy;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskFacade taskFacade;

    @GetMapping
    public List<Task> getTasks(@RequestParam(value = "sortBy", defaultValue = "creationDate") String sortBy) {
        if (sortBy.equals("priority")) {
            taskFacade.getTaskService().setSortingStrategy(new ByPriorityStrategy());
        } else {
            taskFacade.getTaskService().setSortingStrategy(new ByCreationDateStrategy());
        }
        return taskFacade.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskFacade.createTask(task);
    }
}
