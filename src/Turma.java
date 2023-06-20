public class Turma {
    private String codigoTurma;
    private int qtdAlunos;

    public Turma(String codigoTurma, int qtdAlunos) {
        this.codigoTurma = codigoTurma;
        this.qtdAlunos = qtdAlunos;
    }

    // Métodos Get e Set

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }
}
