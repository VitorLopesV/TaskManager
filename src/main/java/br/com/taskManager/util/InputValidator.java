package br.com.taskManager.util;

import br.com.taskManager.enums.PriorityTasks;

public class InputValidator {

    private InputInformations inputInformations;

    public InputValidator(InputInformations inputInformations) {
        this.inputInformations = inputInformations;
    }

    public boolean verifyIfNewTaskInserted(String msg) {
        System.out.print(msg);
        if (this.inputInformations.inputIntegerInformation() != 1) {
            UI.finishingApllication();
            return false;
        }
        return true;
    }

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
