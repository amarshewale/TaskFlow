package com.taskflow.taskflow.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskflow.taskflow.model.Task;
import com.taskflow.taskflow.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	

	private final TaskService taskService;

	public TaskController(TaskService taskService) {
		super();
		this.taskService = taskService;
		
	}
	
	@PostMapping

	public Task creatTask(@RequestBody Task task) {
		
		return taskService.createTask(task);
	}
	
	
	
	
	@GetMapping
	public List<Task> getAllTask(){
		
		return taskService.getAllTask();	
	    
		
	}
	
	@GetMapping("/{id}")
	public Task getById(@PathVariable Integer id){
		
		return taskService.getById(id);	
	    
		
	}
	
	@PutMapping("/{id}")
	public Task updateTask(@PathVariable Integer id,@RequestBody Task task) {
		
		return taskService.updateTask(id, task);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable Integer id) {
		
		 taskService.deleteTask(id);
	}


}
