package com.dneves.taskmanager.service.strategy;


import java.util.List;

import com.dneves.taskmanager.model.Task;

public interface TaskSortingStrategy {
    List<Task> sort(List<Task> tasks);
}
