public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setNotaProva1(2.5f);
        aluno.setNotaProva2(1f);
        aluno.setNotaTrabalho(1f);

        aluno.mediaFinal();
        System.out.println(aluno.NotaFinal());
    }
}