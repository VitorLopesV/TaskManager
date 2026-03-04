package br.com.taskManager.util;

import java.util.Scanner;

/**
 * Gerenciador de entradas.
 */
public class InputInformations {

    /** Scanner. */
    // Não fechar este Scanner porque ele usa System.in
    Scanner scanner = new Scanner(System.in);

    /**
     * Input de strings.
     *
     * @return Valor entrada da string.
     */
    public String inputStringInformation(){
       return this.scanner.nextLine();
    }

    /**
     * Input de inteiros.
     *
     * @return Valor da entrada do inteiro
     */
    public int inputIntegerInformation(){
        return Integer.parseInt(scanner.nextLine());
    }
}
