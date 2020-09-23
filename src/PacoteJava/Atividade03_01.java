package PacoteJava;

import javax.swing.*;

public class Atividade03_01 {

    public static void main(String args[]) {
        double altura, alturaMax = 0, alturaMin = 3.0, alturaMed = 0,contM = 0;
        int idade, menorIdadeM = 100, maiorIdadeH = 0;
        char sexo = 0;
        
        
        for (int i = 0; i < 50; i++) {
            String aux = JOptionPane.showInputDialog(null,"Insira a altura da "+(i+1)+"º pessoa");
            aux = aux.replace(',', '.');
            altura =Double.parseDouble(aux);
            if(altura > alturaMax){
                alturaMax = altura;
            }else
            if(altura < alturaMin){
                alturaMin = altura;
            }
            
            String sexoInf = JOptionPane.showInputDialog(null,"Insira o sexo da "+(i+1)+"º pessoa \n"
                    +"'F' para feminino ou 'M' para masculino");
            sexo = sexoInf.charAt(0);
            if(sexo == 'f' || sexo == 'F'){
                alturaMed += altura;
                contM++;
                
            }else
            if(sexo == 'm' || sexo == 'M'){
                
            }
            
            String idadeInf = JOptionPane.showInputDialog(null, "Insira a idade da "+(i+1)+"º pessoa");
            idade = Integer.parseInt(idadeInf);
            if(idade > maiorIdadeH && sexo == 'm' || sexo == 'M'){
                maiorIdadeH = idade;
            }else 
            if(idade < menorIdadeM && sexo == 'f' || sexo == 'F'){
                menorIdadeM = idade;
            }    
        }
        JOptionPane.showMessageDialog(null, "Maior altura: "+alturaMax);
        JOptionPane.showMessageDialog(null, "Menor altura: "+alturaMin);
        JOptionPane.showMessageDialog(null, "Média altura das mulheres: "+alturaMed/contM);
        JOptionPane.showMessageDialog(null, "Homem mais velho: "+maiorIdadeH);
        JOptionPane.showMessageDialog(null, "Mulher mais nova: "+menorIdadeM);
    
    }
    
}
    