package org.example.list;

import javax.swing.*;
import java.text.DecimalFormat;

public class LandArea {
    public static void main(String args[]){
        Double largura, comprimento, valor, area;
        largura = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura do terreno:"));
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe a comprimento do terreno:"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por metro quadrado:"));

        area = largura * comprimento;
        valor = valor * area;

        DecimalFormat decimal = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "Esse é o valor do seu terreno: " + decimal.format(valor));


    }
}
