package br.com.taskManager.enums;

/**
 * Enumerador de prioridades das tarefas.
 */
public enum PriorityTasks {

    HIGH("Prioridade Alta", "⛔"),
    MEDIUM("Prioridade Média", "⚠️"),
    LOW("Prioridade Baixa", "❇️");

    /** Prioridade da tarefa*/
    private String priority;

    /** Icone que representa a prioridade da tarefa.*/
    private String icon;

    /**
     * @return {@link #priority}
     */
    public String getPriority() {
        return priority;
    }

    /**
     * @return {@link #icon}
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Construtor.
     *
     * @param priority {@link #priority}
     * @param icon {@link #icon}
     */
    PriorityTasks(String priority, String icon) {
        this.priority = priority;
        this.icon = icon;
    }
}
