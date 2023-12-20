package org.example.list;

public class ElectronicBox {
    public static void main(String args[]){
        int operation = 1;
        switch (operation){
            case 1:
                System.out.println("Déposito");
                break;
            case 2:
                System.out.println("Seu saldo é UNDEFINED!");
                break;
            default:
                System.out.println("Não sei que operação é essa!");
                break;
        }
    }
}
