package com.ej.tasks.service;

import com.ej.tasks.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    Iterable<Task> listTasks();

    Task saveTask(Task task);
}
