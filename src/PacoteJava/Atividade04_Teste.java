package PacoteJava;

public class Atividade04_Teste {
    
    public static void main(String[] args) {
        
        Atividade04_Cliente ac = new Atividade04_Cliente();
        
        Atividade04_Funcionario af = new Atividade04_Funcionario();
        
        //Cliente
        ac.setNome("Oswaldo de Oliveira");
        ac.setCpf("123.456.789-10");
        ac.setDataNascimento("22/07/1965");
        ac.setEmail("oswaldooliveira65@gmail.com");
        ac.setTelefone("(11)1234-5678");
        ac.setClienteDesde("2009");
        
               
        //Funcionário
        af.setNome("Francisco Augusto");
        af.setCpf("111.223.442-98");
        af.setDataNascimento("12/08/1985");
        af.setEmail("chicoaugusto@outlook.com");
        af.setTelefone("(11)5689-3321");
        af.setRegistro("55555555667");
        af.setPis("12345678901");
        af.setCarteiraTrabalho("33456821893");
        
        
        System.out.println("CLIENTE"+
                "\nNome do cliente: "+ac.getNome()
                +"\nCpf do cliente: "+ac.getCpf()
                +"\nData de nascimento do cliente: "+ac.getDataNascimento()
                +"\nEmail do cliente: "+ac.getEmail()
                +"\nTelefone do cliente: "+ac.getTelefone()
                +"\nCliente desde "+ac.getClienteDesde());
        
         System.out.println("\nFUNCIONÁRIO"+
                 "\nNome do funcinário: "+af.getNome()
                +"\nCpf do funcinário: "+af.getCpf()
                +"\nData de nascimento do funcinário: "+af.getDataNascimento()
                +"\nEmail do funcinário: "+af.getEmail()
                +"\nTelefone do funcinário: "+af.getTelefone()
                +"\nRegistro do funcionário: "+af.getRegistro()
                +"\nPis do funcinário: "+af.getPis()
                +"\nCarteira de trabalho do funcinário: "+af.getCarteiraTrabalho());
        
    }
    
    
}
