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

        System.out.println("*********************************");
        System.out.println("\nNome: " + conta.getNome());
        System.out.println("Tipo de conta: ");
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("\n*********************************");

        System.out.println("""
        \n************* MENU **************
        
        1 - Consultar saldos
        2 - Receber valor
        3 - Transferir valor
        4 - Sair
        
        Digite a opção desejada:
        """);
        input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("funcionou 1");
                break;
            case 2:
                System.out.println("funcionou 2");
                break;
            case 3:
                System.out.println("funcionou 3");
                break;
            case 4:
                System.out.println("funcionou 4");
                break;
        }

        sc.close();
    }
}
