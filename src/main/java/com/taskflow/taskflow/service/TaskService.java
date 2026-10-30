package com.taskflow.taskflow.service;



import java.util.List;


import org.springframework.stereotype.Service;

import com.taskflow.taskflow.model.Task;
import com.taskflow.taskflow.repository.TaskRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class TaskService{
	
	
	private  final TaskRepository taskRepository;
	


	public TaskService(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}

	public TaskRepository getTaskRepository() {
		return taskRepository;
	}
	
	
	public Task createTask(Task task) {
		
	    return taskRepository.save(task);
	    
		
		
	}

	
	public List<Task> getAllTask(){
		
		return taskRepository.findAll();
		
			
		
	}

    public Task getById(Integer id){
		
		return taskRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Task not found with "+id));
		
			
		
	}
    
    @Transactional
    public Task updateTask(Integer id,Task updateTask) {
		
    	Task existingTask = getById(id);
    	
    	existingTask.setTitle(updateTask.getTitle());
    	
    	existingTask.setDescription(updateTask.getDescription());
    	
    	existingTask.setPriority(updateTask.getPriority());
    	
    	existingTask.setStatus(updateTask.getStatus());
    	
    	existingTask.setDueDate(updateTask.getDueDate());
    	
    	
    	return taskRepository.save(existingTask);
    	
		
    	
    }
    
    @Transactional
    public void deleteTask(Integer id) {
    	
    	
    	
             taskRepository.deleteById(id);
    }

	
	
	
	
	
	
}


