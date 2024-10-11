package com.dio.cursojava.DesafioContaBancaria;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        //Criação das variaveis e definição dos valores
        System.out.println("Por favor, digite o numero da conta: ");
        int numero = scan.nextInt();

        System.out.println("Por favor, digite o numero da agencia: ");
        String agencia = scan2.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scan2.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scan.nextDouble();

        //Imprime os valores digitados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

