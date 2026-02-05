package br.com.taskManager.service;

import br.com.taskManager.model.Task;
import br.com.taskManager.repository.TaskFileRepository;

public class TaskService {

    private TaskFileRepository taskRepository;

    public TaskService(TaskFileRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTaskInFile(Task task){
        this.taskRepository.save(task);
    }
}
