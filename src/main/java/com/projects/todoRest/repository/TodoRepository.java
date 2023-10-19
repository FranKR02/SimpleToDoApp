package com.projects.todoRest.repository;

import com.projects.todoRest.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
