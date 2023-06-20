public abstract class Funcionario {
    private String nome;
    private String cpf;
    private int numRegistro;
    private String orgaoLotacao;
    private double salario;

    public Funcionario(String nome, String cpf, int numRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, int numRegistro, String orgaoLotacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.orgaoLotacao = orgaoLotacao;
    }

    // Métodos da Classe
    public void aumentarSalario(){

    }

    public abstract void exibirInformacoesComplestas();

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                " | CPF: " + getCpf() +
                " | Número de Registro: " + getNumRegistro();
    }

    // Métodos Get e Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
