package br.com.taskManager.util;

import br.com.taskManager.enums.PriorityTasks;

/**
 * Validador de entradas.
 */
public class InputValidator {

    /** {@link InputInformations}. */
    private InputInformations inputInformations;

    /**
     * Construtor.
     *
     * @param inputInformations {@link #inputInformations}
     */
    public InputValidator(InputInformations inputInformations) {
        this.inputInformations = inputInformations;
    }

    /**
     * Verifica se será inserida uma nova tarefa.
     *
     * @param msg Mensgam que será exibida para o usuário.
     * @return {@code False} se for adicionar mais uma tarefa a lista e {@code True} caso contrário.
     */
    public boolean verifyIfNewTaskInserted(String msg) {
        System.out.print(msg);
        if (this.inputInformations.inputIntegerInformation() != 1) {
            UI.finishingApllication();
            return false;
        }
        return true;
    }

    /**
     * Adiciona o nível de prioridade da tarefa
     *
     * @param option opção referente ao tipo de prioridade.
     * @return Prioridade da tarefa.
     */
    public PriorityTasks addPriorityInTask(int option) {
        PriorityTasks priorityTask = null;
        switch (option) {
            case 1 -> priorityTask = PriorityTasks.LOW;
            case 2 -> priorityTask = PriorityTasks.MEDIUM;
            case 3 -> priorityTask = PriorityTasks.HIGH;
            default -> throw new IllegalArgumentException(Constants.VALUE_PROVIDED_DOES_NOT_EXIST_MESSAGE);
        }
        return priorityTask;
    }

    /**
     * Insere a descrição da tarefa
     *
     * @return Descrição da tarefa.
     */
    public String InsertDescriptionTask(){
        String description = this.inputInformations.inputStringInformation();
        if(description.isEmpty()){
           throw new IllegalArgumentException(Constants.INVALID_VALUE_ERROR);
        }
        return description;
    }

    public PriorityTasks insertPriorityTask(){
        return this.addPriorityInTask(this.insertIntegerValue());
    }

    public Integer insertExecutionTime(){
        return this.insertIntegerValue();
    }

    private Integer insertIntegerValue(){
        try{
            return Integer.parseInt(this.inputInformations.inputStringInformation());
        } catch(NumberFormatException e){
            throw new IllegalArgumentException(Constants.INVALID_VALUE_ERROR);
        }
    }
}
