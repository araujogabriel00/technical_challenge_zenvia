package com.zenvia.services;

import com.zenvia.entities.Conta;

import java.io.IOException;

public class ContaService {

    public Double saqueQTDNotas(Conta conta, int valorpagar) throws IOException {

        int[] notas = new int[]{100, 50, 20, 10, 5, 2, 1};
        int[] totalNotas = new int[7];

        Double saldoFinal = conta.getSaldo() - valorpagar;

        if (conta.getSaldo() >= valorpagar && valorpagar > 0) {

            for (int i = 0; i < notas.length; i++) {
                if (valorpagar >= notas[i]) {
                    totalNotas[i] = valorpagar / notas[i];
                    valorpagar = valorpagar - totalNotas[i] * notas[i];
                    System.out.println (totalNotas[i] + " nota(s) de R$ " + notas[i] + ",00");
                }
            }
        System.out.println("Saque efetuado por: " +  conta.getPessoa().getName());

        }else if (valorpagar == 0){

        }else {
            System.out.println("Saldo insuficiente");
        }
        return saldoFinal;
    }

}

