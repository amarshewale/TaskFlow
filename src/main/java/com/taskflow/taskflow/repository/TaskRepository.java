package com.taskflow.taskflow.repository;

import com.taskflow.taskflow.model.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}
