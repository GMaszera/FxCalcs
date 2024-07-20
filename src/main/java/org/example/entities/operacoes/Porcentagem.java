package org.example.entities.operacoes;


import org.example.entities.Calcs;

import java.util.Scanner;

public class Porcentagem {
    private double valueA = 0;
    private double valueB = 0;
    private double result = 0;

    public Porcentagem() {
    }

    public void compli() {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira o valor: ");
        double valueA = in.nextDouble();

        System.out.print("Valor da porcentagem: ");
        double valueB = in.nextDouble();

        calc(valueA, valueB);
    }

    private void calc(double valueA, double valueB) {
        double calcs = valueA * (valueB / 100);
        System.out.println("Valor da porcentagem: " + calcs);
        result += valueA + calcs;
        valueResult();
    }

    public void valueResult() {
        System.out.println("Valor ajustado: " + result);
        Calcs a = new Calcs();
        a.calcs();
    }
}
