package com.dneves.taskmanager.service.strategy;


import java.util.Collections;
import java.util.List;

import com.dneves.taskmanager.model.Task;

public abstract class ByPriorityStrategy implements TaskSortingStrategy {

    @Override
    public List<Task> sort(List<Task> tasks) {
        // Sorting logic by priority
        Collections.sort(tasks, (a, b) -> a.getPriority().compareTo(b.getPriority()));
        return tasks;
    }
}