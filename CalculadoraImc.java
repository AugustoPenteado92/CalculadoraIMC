package CalculadoraImc;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraImc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double altura, peso, imc;

        altura = Double.parseDouble(JOptionPane.showInputDialog(" Digite sua Altura: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog(" Digite seu peso: "));

        imc = peso / (altura * altura);
        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(imc);

        if (imc >= 18.5 && imc <= 24.9) {

            JOptionPane.showMessageDialog(null, "IMC =" + valorFormatado + " Peso Normal ");

        } else if (imc >= 25 && imc <= 29.9) {

            JOptionPane.showMessageDialog(null, "IMC =" + valorFormatado + " Sobrepeso ");

        } else if (imc >= 30 && imc <= 34.9) {

            JOptionPane.showMessageDialog(null, "IMC =" + valorFormatado + " Obesidade Grau I ");

        } else if (imc >= 35 && imc <= 39.9) {

            JOptionPane.showMessageDialog(null, "IMC =" + valorFormatado + " Obesidade Grau II ");

        } else if (imc >= 40) {

            JOptionPane.showMessageDialog(null, "IMC =" + valorFormatado + " Obesidade Mórbida ");

        } else {

            JOptionPane.showMessageDialog(null, "IMC =" + valorFormatado + " Peso Baixo ");


        }


    }


}
















