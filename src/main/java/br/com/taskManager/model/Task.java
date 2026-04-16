package br.com.taskManager.model;

import br.com.taskManager.enums.PriorityTasks;

public class Task {

    private String description;

    private PriorityTasks priority;

    private double executionTime;

    public Task(String description, PriorityTasks priority, double executionTime) {
        this.description = description;
        this.priority = priority;
        this.executionTime = executionTime;
    }

    @Override
    public String toString() {
        return description + " - " + priority.getPriority() + priority.getIcon() + " - " + executionTime + " Minutos🕛";
    }
}
