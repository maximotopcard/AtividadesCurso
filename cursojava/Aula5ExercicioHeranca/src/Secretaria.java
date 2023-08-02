public class Secretaria extends Funcionario{
    private int pontucaoAtendimento;
    private int mesaDeTrabalho;

    public Secretaria(String nome, String cpf, int idade, String dataNascimento, int pontucaoAtendimento, int mesaDeTrabalho){
        super(nome, cpf, idade, dataNascimento);
        this.pontucaoAtendimento = pontucaoAtendimento;
        this.mesaDeTrabalho = mesaDeTrabalho;
    }
}

