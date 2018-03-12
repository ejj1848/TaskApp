package com.ej.tasks.service.Impl;

import com.ej.tasks.domain.Task;
import com.ej.tasks.repository.TaskRepository;
import com.ej.tasks.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;


    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository =taskRepository;
    }

    @Override
    public Iterable<Task> listTasks() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task saveTask(Task task) {
        return this.taskRepository.save(task);
    }
}
