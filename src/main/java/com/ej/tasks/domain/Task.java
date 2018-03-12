package com.ej.tasks.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data

public class Task {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dueDate;
    private boolean completed;

    public Task(){}

    public Task(String name, LocalDate dueDate, boolean completed) {
        this.name = name;
        this.dueDate = dueDate;
        this.completed = completed;
    }
}
