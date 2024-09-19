package com.java.bank.conta;

public class Conta {
    private String nome;
    private double saldo = 1359.59;
    private String conta;

    public Conta(String nome, int saldo, String conta) {
        this.nome = nome;
        this.saldo = saldo;
        this.conta = conta;
    }

    public Conta() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque (double valor) {
        this.saldo -= valor;
    }
}