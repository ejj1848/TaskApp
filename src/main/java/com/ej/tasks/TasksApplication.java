package com.ej.tasks;

import com.ej.tasks.domain.Task;
import com.ej.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(TaskService taskService){
		return args-> {
			taskService.saveTask(new Task("First", LocalDate.now().plus(1, ChronoUnit.DAYS),true));
			taskService.saveTask(new Task("Second",LocalDate.now().plus(2, ChronoUnit.DAYS),true));
			taskService.saveTask(new Task("Third",LocalDate.now().plus(3,ChronoUnit.DAYS),true));
			taskService.saveTask(new Task("Fourth",LocalDate.now().plus(4,ChronoUnit.DAYS),true));
			taskService.saveTask(new Task("Five",LocalDate.now().plus(5,ChronoUnit.DAYS),true));
			taskService.saveTask(new Task("Six",LocalDate.now().plus(6,ChronoUnit.DAYS),true));
			taskService.saveTask(new Task("Seven",LocalDate.now().plus(7,ChronoUnit.DAYS),true));

		};
	}
}
