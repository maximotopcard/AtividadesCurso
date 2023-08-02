public class Telefonista extends Funcionario {
    private String telefone;
    private int ramal;

    public Telefonista(String nome, String cpf, int idade, String dataNascimento, String telefone, int ramal){
        super(nome, cpf, idade, dataNascimento);
        this.telefone = telefone;
        this.ramal = ramal;
    }

}
