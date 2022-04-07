package com.zenvia;

import com.zenvia.entities.Conta;
import com.zenvia.entities.Pessoa;
import com.zenvia.services.ContaService;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Integer valorpagar;
        Scanner sc = new Scanner(System.in);

        //Instaciando os Objetos
        Pessoa pessoa = new Pessoa(1L, "Gabriel Araújo");
        Conta conta = new Conta(pessoa, 1L, 100000000000000000.00);
        ContaService contaService = new ContaService();

        //Entradas
        System.out.println("Digite o valor a ser sacado: ");
        valorpagar = sc.nextInt();

        //Chamada da Operação
        contaService.saqueQTDNotas(conta, valorpagar);


    }
}
