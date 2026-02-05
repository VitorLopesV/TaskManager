package br.com.taskManager.repository;

import br.com.taskManager.model.Task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TaskFileRepository {

    public void save(Task task) {
        try(BufferedWriter writter = new BufferedWriter(new FileWriter("To-do List.txt", true))){
            writter.write(task.toString());
            writter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
