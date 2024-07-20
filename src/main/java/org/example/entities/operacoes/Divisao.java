package org.example.entities.operacoes;


import com.sun.jdi.Value;
import org.example.entities.Calcs;

import java.util.Scanner;

public class Divisao {
    private double valueA = 0;
    private double valueB = 0;
    private double result = 0;

    public Divisao() {
    }

    public void compli() {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira o 1° valor: ");
        double valueA = in.nextDouble();

        System.out.print("Insira o 2° valor: ");
        double valueB = in.nextDouble();
        calc(valueA,valueB);
    }

    private void calc(double valueA, double valueB) {

        result += valueA / valueB ;
        valueResult();
    }

    public void valueResult(){
        System.out.println("Resultado: " + result);
        Calcs a = new Calcs();
        a.calcs();
    }
}
