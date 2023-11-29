package org.example;

import javax.swing.*;
import java.text.DecimalFormat;

public class CalculateIMC {
    public static void main(String args[]){
        double altura, peso, imc;
        String resultado = "";

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura:"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite a seu peso:"));

        imc = peso / (altura * altura);

        if(imc < 18.5) resultado = "abaixo do peso!";
        else if (imc > 18.5 && imc < 24.9) resultado = "peso ideal!";
        else resultado = "acima do peso!";

        DecimalFormat decimal = new DecimalFormat("0.00");
        String imcFormatado = decimal.format(imc);



        JOptionPane.showMessageDialog(null, "Esse é seu IMC " + imcFormatado + " e você está " + resultado);

    }
}
