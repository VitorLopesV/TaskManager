package br.com.taskManager.controller;

import br.com.taskManager.enums.PriorityTasks;
import br.com.taskManager.model.Task;
import br.com.taskManager.service.TaskService;
import br.com.taskManager.util.Constants;
import br.com.taskManager.util.InputValidator;
import br.com.taskManager.util.UI;

public class TaskController {

    private TaskService taskService;

    private InputValidator inputValidator;

    private boolean stopFlag = true;

    public TaskController(TaskService taskService, InputValidator inputValidator) {
        this.taskService = taskService;
        this.inputValidator = inputValidator;
    }

    public void run() {
        UI.informInitialInformation();
        if(!this.inputValidator.verifyIfNewTaskInserted(Constants.PRIMARY_QUESTION)){
            this.stopFlag = false;
        }

        while (this.stopFlag) {
            this.taskService.addTaskInFile(this.addTask());
            this.inputValidator.verifyIfNewTaskInserted(Constants.FINAL_INFORMATION);
        }
    }

    private Task addTask() {
        UI.insertDescriptionMessage();
        String description = this.inputValidator.InsertDescriptionTask();

        UI.informPriorityMessage();
        PriorityTasks priorityTask = this.inputValidator.insertPriorityTask();

        UI.insertExecutionTimeMessage();
        double executionTime = this.inputValidator.insertExecutionTime();

        return new Task(description, priorityTask, executionTime);
    }
}
