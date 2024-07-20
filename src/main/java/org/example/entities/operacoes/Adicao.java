package org.example.entities.operacoes;


import org.example.entities.Calcs;

import java.util.Scanner;

public class Adicao {
    private int valueA = 0;
    private int valueB = 0;
    private int result = 0;

    public Adicao() {
    }

    public void compli() {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o 1° valor:");
        int valueA = in.nextInt();

        System.out.println("Insira o 2° valor:");
        int valueB = in.nextInt();

        calc(valueA, valueB);
    }

    private int calc(int valueA, int valueB) {
        result += valueA + valueB;
        valueResult();
        return result;
    }

    public void valueResult() {
        System.out.println("Resultado: " + result);
        Calcs a = new Calcs();
        a.calcs();
    }
}
