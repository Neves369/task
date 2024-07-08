package com.dneves.taskmanager.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.dneves.taskmanager.model.Task;
import com.dneves.taskmanager.repository.TaskRepository;
import com.dneves.taskmanager.service.strategy.TaskSortingStrategy;

import java.util.List;

public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    private TaskSortingStrategy sortingStrategy;

    public void setSortingStrategy(TaskSortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public List<Task> findAllTasks() {
        List<Task> tasks = taskRepository.findAll();
        return sortingStrategy.sort(tasks);
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }
}