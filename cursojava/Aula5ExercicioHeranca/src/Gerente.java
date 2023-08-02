public class Gerente extends Funcionario {
    private int anoInicioGestao;
    private int codEquipe;

    public Gerente(String nome, String cpf, int idade, String dataNascimento, int anoInicioGestao, int codEquipe){
        super(nome, cpf, idade, dataNascimento);
        this.anoInicioGestao = anoInicioGestao;
        this.codEquipe = codEquipe;
    }
}
