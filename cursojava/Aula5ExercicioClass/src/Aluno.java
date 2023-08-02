public class Aluno {
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;
    private double nota;

    public void mediaFinal(){
        nota = notaProva1 + notaProva2 + notaTrabalho;
    }

    public  String  NotaFinal(){
        if(nota > 4){
            return nome + " Passou!";
        }
        else {
            return nome + " Reprovou";
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
}

