package com.dneves.taskmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dneves.taskmanager.service.TaskService;


@Configuration
public class SingletonConfig {

    @Bean
    public TaskService taskService() {
        return new TaskService();
    }
}
