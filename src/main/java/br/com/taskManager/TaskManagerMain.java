package br.com.taskManager;

import br.com.taskManager.controller.TaskController;
import br.com.taskManager.repository.TaskFileRepository;
import br.com.taskManager.service.TaskService;
import br.com.taskManager.util.InputInformations;
import br.com.taskManager.util.InputValidator;

public class TaskManagerMain {

    public static void main(String[] args) {
        InputInformations inputInformations = new InputInformations();
        TaskFileRepository taskRepository = new TaskFileRepository();
        TaskService taskService = new TaskService(taskRepository);
        InputValidator inputValidator = new InputValidator(inputInformations);
        TaskController taskController = new TaskController(taskService, inputValidator);

        taskController.run();
    }
}