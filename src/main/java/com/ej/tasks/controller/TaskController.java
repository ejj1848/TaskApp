package com.ej.tasks.controller;

import com.ej.tasks.domain.Task;
import com.ej.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})
    public Iterable<Task> listTasks(){
        return this.taskService.listTasks();
    }

    @PostMapping(value = "/save")
    public Task saveTask(@RequestBody Task task){
        return this.taskService.saveTask(task);
    }

}
