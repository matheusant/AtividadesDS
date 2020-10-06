package PacoteJava;

public class Atividade04_Funcionario extends Atividade04_PessoaFisica{
    private String registro;
    private String carteiraTrabalho;
    private String pis;

    public Atividade04_Funcionario() {
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }
    
}
