package com.example.TaskManagerFaculdade.repository;

import com.example.TaskManagerFaculdade.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
