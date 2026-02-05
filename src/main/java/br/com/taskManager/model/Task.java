package br.com.taskManager.model;

import br.com.taskManager.enums.PriorityTasks;

/**
 * Representa o modelo de tarefa.
 */
public class Task {

    /** Descrição do que será feito. */
    private String description;

    /** Nível de Prioridade. */
    private PriorityTasks priority;

    /** Tempo de execução. */
    private double executionTime;

    /**
     * Construtor.
     *
     * @param description   {@link #description}
     * @param priority      {@link #priority}
     * @param executionTime {@link #executionTime}
     */
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
