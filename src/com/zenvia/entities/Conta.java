package com.zenvia.entities;

import java.util.Objects;

public class Conta {

    private Long id;
    private Double saldo;
    private Pessoa pessoa;

    public Conta(){

    }

    public Conta(Pessoa pessoa, Long id, Double saldo) {
        this.pessoa = pessoa;
        this.id = id;
        this.saldo = saldo;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return id.equals(conta.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
