package com.simple.dao;

import org.springframework.data.repository.CrudRepository;

import com.simple.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
