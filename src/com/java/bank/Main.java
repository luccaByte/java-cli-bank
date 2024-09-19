package com.java.bank;

import com.java.bank.conta.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        Conta conta = new Conta();

        System.out.println("""
        Bem vindo!
        Digite o seu nome:
        """);
        conta.setNome(sc.nextLine());

        System.out.println("""
        Escolha o tipo de conta:
        1 - Conta Corrente
        2 - Conta Poupança
        """);
        int tipoConta = sc.nextInt();

        if (tipoConta == 1) {
            conta.setConta("Conta Corrente");
        } else if (tipoConta == 2) {
            conta.setConta("Conta Poupança");
        } else {
            System.out.println("Opção inválida");
        }

        System.out.println("**************************************");
        System.out.printf("""
        Dados do Cliente
        
        Nome:                %s
        Tipo de conta:       %s
        Saldo:            R$ %.2f     \s
        %n""", conta.getNome(), conta.getConta(), conta.getSaldo());
        System.out.println("**************************************");

        do {
            System.out.println("""
            \n**************** MENU ****************
            
            1 - Consultar saldos
            2 - Receber valor
            3 - Transferir valor
            4 - Sair
            
            Digite a opção desejada:
            """);
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.printf("\nSaldo atual:         R$ %.2f\n",conta.getSaldo());
                    break;
                case 2:
                    System.out.println("\nInforme o valor a receber:");
                    double valorDeposito = sc.nextDouble();
                    conta.deposito(valorDeposito);
                    System.out.printf("\nSaldo atualizado: R$ %.2f\n", conta.getSaldo());
                    break;
                case 3:
                    System.out.println("\nInforme o valor a retirar:");
                    double valorSaque = sc.nextDouble();
                    conta.saque(valorSaque);
                    System.out.printf("\nSaldo atualizado: R$ %.2f\n", conta.getSaldo());
                    break;
                case 4:
                    System.out.println("\nSaindo. . .");
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente.");
            }
        } while (input != 4);

        sc.close();
    }
}
