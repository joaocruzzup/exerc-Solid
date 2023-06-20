import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario implements Reembolsavel{
    private List<Professor> professoresSupervisionados;

    public Coordenador(String nome, String cpf, int numRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = new ArrayList<>();
    }

    // Métodos da classe
    @Override
    public void aumentarSalario() {
        double salario = getSalario();
        double salarioAumentado = salario + (salario * 0.05);
        setSalario(salarioAumentado);
    }

    public void adicionarProfessor(Professor professor) {
        if (professoresSupervisionados.size() >= 5){
            System.out.println("Erro: Cada coordenador só pode ter 1 professor");
            System.out.println("Remova um professor para adicionar outro");
        }
        this.professoresSupervisionados.add(professor);
    }

    public void exibirInformacoesComplestas(){
        System.out.print("Informações de Coord. * " + getNome() + " *" +
                "\nCPF: " + getCpf() +
                "\nNúmero de Registro: " + getNumRegistro() +
                "\nÓrgão de Lotação:" + getOrgaoLotacao() +
                "\nSalário: R$" + getSalario() +
                "\nProfessores Supervisionados: ");
        if (getProfessoresSupervisionados().size() == 0){
            System.out.print("[ Ainda não há professores supervisionados ]");
        } else {
            System.out.print("[ " + getProfessoresSupervisionados() + " ]");
        }
    }

    @Override
    public double reembolsarDespesas(double valor) {
        return valor;
    }

    // Métodos Get e Set
    public List<Professor> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(List<Professor> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }



}
