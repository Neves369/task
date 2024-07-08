package com.dneves.taskmanager.service.strategy;


import java.util.Collections;
import java.util.List;

import com.dneves.taskmanager.model.Task;

public class ByCreationDateStrategy implements TaskSortingStrategy {

    public List<Task> sort(List<Task> tasks) {
        // Sorting logic by creation date
        Collections.sort(tasks, (a, b) -> a.getCreationDate().compareTo(b.getCreationDate()));
        return tasks;
    }
}
