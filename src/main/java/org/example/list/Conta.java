package org.example.list;
public class Conta {
    public static void main(String[] args) {
        User user = new User();
        user.nome = "Luzia Gabriela Abreu da Silva Santos";
        user.numero = 2;
        user.saldo = 1200.00;

        System.out.println(user.nome);
        System.out.println(user.numero);
        System.out.println(user.saldo);
    }
}