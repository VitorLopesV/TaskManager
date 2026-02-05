package br.com.taskManager.util;

import br.com.taskManager.enums.PriorityTasks;

public class UI {

    public static void informPriorityMessage() {
        System.out.println("1- " + PriorityTasks.LOW.getPriority());
        System.out.println("2- " + PriorityTasks.MEDIUM.getPriority());
        System.out.println("3- " + PriorityTasks.HIGH.getPriority());
        System.out.print(Constants.ENTER_PRIORITY_MESSAGE);
    }

    public static void insertDescriptionMessage() {
        System.out.print(Constants.ENTER_DESCRIPTION_MESSAGE);
    }

    public static void insertExecutionTimeMessage() {
        System.out.print(Constants.ENTER_EXECUTION_TIME_MESSAGE);
    }

    public static void informInitialInformation() {
        System.out.println(Constants.INITIAL_INFORMATION);
    }

    public static void finishingApllication() {
        System.out.println(Constants.FINISHING);
    }
}
