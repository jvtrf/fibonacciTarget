package br.com.jvtrf;

import java.util.Scanner;

public class FibonacciTarget {

    private Boolean isFibonacci() {
        System.out.println("Insira um valor");
        Scanner sc = new Scanner(System.in);
        int valorInserido = sc.nextInt();
        if(valorInserido == 0) {
            return true;
        } else {
            int fiboAnterior = 0;
            int fiboProximo = 1;
            while(fiboProximo < valorInserido) {
                fiboAnterior = fiboProximo - fiboAnterior;
                fiboProximo += fiboAnterior;
            }
            if(fiboProximo == valorInserido) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void fibonnaci() {
        Boolean valorPertenceFibonnaci = isFibonacci();
        if(valorPertenceFibonnaci) {
            System.out.println("O valor inserido pertence a sequência Fibonnaci");
        } else {
            System.out.println("O valor inserido não pertence a sequência Fibonnaci");
        }
    }
}
