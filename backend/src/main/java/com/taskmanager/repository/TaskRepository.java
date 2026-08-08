package com.taskmanager.repository;

import com.taskmanager.models.Task;
import com.taskmanager.models.enums.TaskPriority;
import com.taskmanager.models.enums.TaskStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

    Page<Task> findByStatusAndAssigneeIdAndPriority(
            TaskStatus status, Long assigneeId, TaskPriority priority, Pageable pageable);

    Page<Task> findByStatus(TaskStatus status, Pageable pageable);

    Page<Task> findByAssigneeId(Long assigneeId, Pageable pageable);

    Page<Task> findByPriority(TaskPriority priority, Pageable pageable);

    Page<Task> findByStatusAndAssigneeId(TaskStatus status, Long assigneeId, Pageable pageable);

    Page<Task> findByStatusAndPriority(TaskStatus status, TaskPriority priority, Pageable pageable);

    Page<Task> findByAssigneeIdAndPriority(Long assigneeId, TaskPriority priority, Pageable pageable);

}