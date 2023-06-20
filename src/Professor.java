import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario implements Reembolsavel{
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;
    private List<Estagiario> listaEstagiarios;
    private List<Turma> listaTurmas;


    public Professor(String nome, String cpf, int numRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplinaMinistrada) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.listaEstagiarios = new ArrayList<>();
        this.listaTurmas = new ArrayList<>();
    }

    // Métodos da Classe
    @Override
    public void aumentarSalario() {
        double salario = getSalario();
        double salarioAumentado = salario + (salario * 0.1);
        setSalario(salarioAumentado);
    }

    @Override
    public void exibirInformacoesComplestas() {
        System.out.print("Informações de Prof. * " + getNome() + " *" +
                "\nCPF: " + getCpf() +
                "\nNúmero de Registro: " + getNumRegistro() +
                "\nÓrgão de Lotação:" + getOrgaoLotacao() +
                "\nSalário: R$" + getSalario() +
                "\nEstagiários: " );
                imprimirEstagiarios();
        System.out.print("\nTurmas: ");
                imprimirTurmas();
        System.out.print("\nTotal de Alunos: " + getQtdAlunos() +
                         "\nToral de Turmas: " + getQtdTurmas() + "\n");
    }

    public void adicionarEstagiario(Estagiario estagiario){
        if (listaEstagiarios.size() >=2){
            System.out.println("Erro: A quantidade de estagiários é maior do que o esperado (2)");
            System.out.println("Remova um estagiário para adicionar outro");
        }
        listaEstagiarios.add(estagiario);
    }

    public void removerEstagiario(Estagiario estagiario){
        if (listaEstagiarios.size() == 0 ){
            System.out.println("Erro: Não há estagiários para remover");
        }
        listaEstagiarios.remove(estagiario);
    }

    public void imprimirEstagiarios(){
        int i = 1;
        if (listaEstagiarios.size() == 0){
            System.out.print("[ Ainda não há Estagiários ]");
        } else {
            for (Estagiario estag:listaEstagiarios) {
                System.out.println("Estágiario " + i + ": " + estag.toString());
                i++;
            }
        }
    }

    public void adicionarTurma(Turma turma) {
        listaTurmas.add(turma);
    }

    public void imprimirTurmas(){
        int i = 1;
        if (listaTurmas.size() == 0){
            System.out.print("[ Ainda não há turmas ]");
        } else {
            for (Turma turma:listaTurmas) {
                System.out.println("Turma: " + i + " |Código da turma: " + turma.getCodigoTurma() + " | Quantidade de alunos: " + turma.getQtdAlunos());
                i++;
            }
        }
    }

    @Override
    public double reembolsarDespesas(double valor) {
        return valor;
    }

    // Métodos Get e Set
    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdAlunos() {
        this.qtdAlunos = 0;
        for (Turma turma : listaTurmas) {
            this.qtdAlunos += turma.getQtdAlunos();
        }
        return this.qtdAlunos;
    }

    public int getQtdTurmas() {
        this.qtdTurmas = 0;
        for (Turma turma: listaTurmas) {
            this.qtdTurmas++;

        }
        return this.qtdTurmas;
    }



}
