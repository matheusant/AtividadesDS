package PacoteJava;

import javax.swing.*;

public class Atividade03_04 {
    public static void main(String[] args) {
        double altura[] = new double[10];
        double soma = 0, media = 0;
        String aux;
        
        
        
        for (int i = 0; i < altura.length; i++) {
            aux = JOptionPane.showInputDialog(null, "Insira a "+(i+1)+"ª altura");
            aux = aux.replace(',', '.');
            altura[i] = Double.parseDouble(aux);
            
            
        }
        for (int i = 0; i < altura.length; i++) {
            soma = soma + altura[i];
        }
        media = soma / 10;
        JOptionPane.showMessageDialog(null, "A média das alturas: "+media,"MÉDIA", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
