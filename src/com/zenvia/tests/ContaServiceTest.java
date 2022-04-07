package com.zenvia.tests;

import com.zenvia.entities.Conta;
import com.zenvia.entities.Pessoa;
import com.zenvia.services.ContaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ContaServiceTest {

    private ContaService contaService;
    private Conta conta;
    private Pessoa pessoa;
    private Integer valorAsacar;
    Double valorEsperado;
    Double resultado;


    @BeforeEach
    void SetUp() throws Exception{
        pessoa = new Pessoa(1L, "Gabriel Araújo");
        conta = new Conta(pessoa, 1L, 10000.00);
        contaService = new ContaService();
        valorAsacar = 2000;
    }

    @Test
    public void saqueDeveDiminuirSaldoDaConta() throws IOException {

        valorEsperado = conta.getSaldo()-valorAsacar;
        resultado = contaService.saqueQTDNotas(conta, valorAsacar);

        Assertions.assertNotNull(resultado);
        Assertions.assertEquals(valorEsperado, resultado);
    }
}
