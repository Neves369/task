package com.dneves.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dneves.taskmanager.model.Task;


public interface TaskRepository extends JpaRepository<Task, Long> {
}
