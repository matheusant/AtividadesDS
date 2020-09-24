package PacoteJava;

import javax.swing.*;

public class Atividade03_02 {

    public static void main(String[] args) {
        char sexo = 0, cabelo = 0;
        int idade, contM = 0, cabeloC = 0;
        double porcento = 0;

        for (int i = 0; i < 300; i++) {
            String sexoInf = JOptionPane.showInputDialog(null, "Insira o sexo da " + (i + 1) + "º pessoa \n"
                    + "'F' para feminino ou 'M' para masculino");
            sexo = sexoInf.charAt(0);
            if (sexo == 'f' || sexo == 'F') {
                contM++;
            } else if (sexo == 'm' || sexo == 'M') {

            }
            String idadeInf = JOptionPane.showInputDialog(null, "Insira a idade da " + (i + 1) + "º pessoa");
            idade = Integer.parseInt(idadeInf);
            if (idade > 30) {
                porcento = i * 100 / 5;
            }
            String cabeloInf = JOptionPane.showInputDialog(null, "Insira a cor do cabelo da " + (i + 1) + "º pessoa \n"
                    + "'C' para Castanho ou 'P' para Preto");
            cabelo = cabeloInf.charAt(0);
            if (cabelo == 'C' || cabelo == 'c') {
                cabeloC++;
            } else if (cabelo == 'P' || cabelo == 'p') {

            }

        }
        JOptionPane.showMessageDialog(null, "Quantidade de Mulheres: " + contM);
        JOptionPane.showMessageDialog(null, "Porcentagem de pessoas com mais de 30 anos " + porcento + "%");
        JOptionPane.showMessageDialog(null, "Quantidade de pessoas com cabelo castanho: " + cabeloC);

    }
}
