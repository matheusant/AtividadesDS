package PacoteJava;

import javax.swing.*;
        
public class Exercicio0706 {
    
    public static void main(String[] args) {
        double salario, valorLiq, salAliq;
        int aliq = 0;
        String aux="";
        
        aux = JOptionPane.showInputDialog(null,"Entre com seu salário: ", "Pagamento", JOptionPane.QUESTION_MESSAGE);
        aux = aux.replace(',', '.');
        salario = Double.parseDouble(aux);
        
        if(salario<465.00){
            JOptionPane.showMessageDialog(null, "Salário Incorreto", "ERRO", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if(salario>=465.00 && salario<=965.67){
            aliq=8;
            salAliq = salario * aliq;
            salAliq /= 100;
            salAliq *= 100;
            salAliq = Math.ceil(salAliq);
            salAliq /= 100;
            valorLiq = salario - salAliq;
            JOptionPane.showMessageDialog(null, "Salário Bruto: R$"+salario+"\n"+"Alíquota(%): "+aliq+"\n"
                    +"Desconto: R$"+salAliq+"\n"+"Valor Liquído: R$"
                    +valorLiq, "Pagamento", JOptionPane.INFORMATION_MESSAGE);
            
            
        }
        if(salario>=965.68 && salario<=1609.45){
            aliq=9;
            salAliq = salario * aliq;
            salAliq /= 100;
            salAliq *= 100;
            salAliq = Math.ceil(salAliq);
            salAliq /= 100;
            valorLiq = salario - salAliq;
            JOptionPane.showMessageDialog(null, "Salário Bruto: R$"+salario+"\n"+"Alíquota(%): "+aliq+"\n"
                    +"Desconto: R$"+salAliq+"\n"+"Valor Liquído: R$"
                    +valorLiq, "Pagamento", JOptionPane.INFORMATION_MESSAGE);
            
            
        }
        if(salario>=1609.46 && salario<=3218.90){
            aliq=11;
            salAliq = salario * aliq;
            salAliq /= 100;
            salAliq *= 100;
            salAliq = Math.ceil(salAliq);
            salAliq /= 100;
            valorLiq = salario - salAliq;
            JOptionPane.showMessageDialog(null, "Salário Bruto: R$"+salario+"\n"+"Alíquota(%): "+aliq+"\n"
                    +"Desconto: R$"+salAliq+"\n"+"Valor Liquído: R$"
                    +valorLiq, "Pagamento", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
       
    
}
