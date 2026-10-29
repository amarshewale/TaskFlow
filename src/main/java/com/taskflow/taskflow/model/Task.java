package com.taskflow.taskflow.model;
import java.time.LocalDate;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tasks")
public class Task {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskId;
	
	@NotBlank(message = "please Enter titl!")	
    @Column(nullable = false)
	private String title;
	
	private String description;
	
	private String status;
	
	private String priority;
	
	private LocalDate dueDate;
	
	public Task() {
		
	}
	
	public Task(Integer taskId, String title, String description, String status, String priority, LocalDate dueDate) {
		super();
		this.taskId = taskId;
		this.title = title;
		this.description = description;
		this.status = status;
		this.priority = priority;
		this.dueDate = dueDate;
	}
	
	
	
	public String getTitle(){
		
		return title;
		
	}
	
	public void setTitle(String title) {
		
		this.title=title;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}



	
	

}
