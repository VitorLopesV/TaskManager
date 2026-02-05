package br.com.taskManager.util;

import java.util.Scanner;

public class InputInformations {

    // Não fechar este Scanner porque ele usa System.in
    Scanner scanner = new Scanner(System.in);

    public String inputStringInformation(){
       return this.scanner.nextLine();
    }

    public int inputIntegerInformation(){
        return Integer.parseInt(scanner.nextLine());
    }
}
