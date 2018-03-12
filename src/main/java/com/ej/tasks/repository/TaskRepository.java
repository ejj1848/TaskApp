package com.ej.tasks.repository;

import com.ej.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;



public interface TaskRepository extends CrudRepository<Task,Long> {



}
