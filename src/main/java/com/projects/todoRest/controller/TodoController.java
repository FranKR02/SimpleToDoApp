package com.projects.todoRest.controller;

import com.projects.todoRest.model.Task;
import com.projects.todoRest.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    @GetMapping(value = "/tasks")
    public ResponseEntity<List<Task>> getTasks(){
        List<Task> tasks = todoRepository.findAll();
        return ResponseEntity.ok(tasks);
    }
    @PostMapping(value = "/savetask")
    public ResponseEntity<Task> saveTask(@RequestBody Task task){
        Task savedTask = todoRepository.save(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);
    }
    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable long id, @RequestBody Task task){
        Task existingTask = todoRepository.findById(id).orElse(null);
        if (existingTask != null) {
            existingTask.setAll(task);
            Task updatedTask = todoRepository.save(existingTask);
            return ResponseEntity.ok(updatedTask);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteTaks(@PathVariable long id){
        Task deleteTask = todoRepository.findById(id).orElse(null);
        if (deleteTask != null) {
            todoRepository.delete(deleteTask);
            return ResponseEntity.status(HttpStatus.OK).body("Task eliminada correctamente.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró la tarea con ID: " + id);
        }
    }
}
