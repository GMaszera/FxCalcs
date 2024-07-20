package org.example.entities;

import org.example.entities.operacoes.Adicao;
import org.example.entities.operacoes.Divisao;
import org.example.entities.operacoes.Porcentagem;
import org.example.entities.operacoes.Subtracao;

import java.util.Scanner;

public class Calcs {

    public void calcs() {
        Scanner entry = new Scanner(System.in);

        System.out.println("Options");
        System.out.println(" + ");
        System.out.println(" - ");
        System.out.println(" / ");
        System.out.println(" % ");
        String option = entry.next();

        //Necessário implementação de uma excessão caso o usuário selecione uma opção inválida (Não existe ou é nulo)
        /*if (option == null) {
            System.out.println("Você não selecionou uma opção !");
            calcs();
        }*/
        switch (option) {

            case "+":
                System.out.println("Operação selecionada: +");
                Adicao adic = new Adicao();
                adic.compli();
                break;
            case "-":
                System.out.println("Operação selecionada: -");
                int subtracao = 0;
                Subtracao sub = new Subtracao();
                sub.compli();
                break;
            case "/":
                System.out.println("Operação selecionada: /");
                int divisao = 0;
                Divisao div = new Divisao();
                div.compli();
                break;
            case "%":
                System.out.println("Operação selecionada: %");
                int porcentagem = 0;
                Porcentagem porce = new Porcentagem();
                porce.compli();
                break;
        }
    }


}
