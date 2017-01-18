package com.company;

import java.util.Scanner;

public class InputOutput {
    private Scanner scanner;

    public InputOutput() {
        scanner = new Scanner(System.in);
    }

    public String inputData() {
        return scanner.nextLine();
    }

    public void outputData(String sample) {
        System.out.println(sample);
    }
}
