package PacoteJava;

import javax.swing.JOptionPane;

public class Atividade03_03 {

    public static void main(String[] args) {
        int numeros[] = new int[10];        
        int impar = 0, par = 0;

        for (int i = 0; i < numeros.length; i++) {
            String aux = JOptionPane.showInputDialog(null, "Insira os números do vetor", "Vetores", JOptionPane.QUESTION_MESSAGE);
            numeros[i] = Integer.parseInt(aux);
            
            if (i < 10) {
                if (i % 2 != 0) {
                    impar = numeros[i] * 3;
                    System.out.println("Triplo dos números nas posições ímpares do vetor: " + "{"+impar+"}");

                }

            }
            if (i < 10) {
                if (i % 2 == 0) {
                    par = numeros[i] * 2;
                    System.out.println("Dobro dos números nas posições pares do vetor: " + "["+par+"]");
                }

            }

        }
    

    }

}
