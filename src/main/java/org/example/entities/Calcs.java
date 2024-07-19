package org.example.entities;

import java.util.Scanner;
import org.example.entities.Adicao;
import org.example.entities.Subtracao;
import org.example.entities.Divisao;
import org.example.entities.RestodDivisao;
public class Calcs {

    public void calcs() {
        Scanner entry = new Scanner(System.in);

        System.out.println("Options");
        System.out.println(" + ");
        System.out.println(" - ");
        System.out.println(" / ");
        System.out.println(" % ");
        String option = entry.next();
        if (option == null) {
            System.out.println("Você não selecionou uma opção !");
            calcs();
        }
        switch (option) {

            case "+":
                System.out.println("Operação selecionada: +");
                Adicao a = new Adicao();
                a.compli();
                break;
            case "-":
                System.out.println("Operação selecionada: -");
                int subtracao = 0;
                break;
            case "/":
                System.out.println("Operação selecionada: /");
                int divisao = 0;
                break;
            case "%":
                System.out.println("Operação selecionada: %");
                int resto = 0;
                break;
        }
    }


}
