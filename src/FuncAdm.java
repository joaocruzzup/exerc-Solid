public class FuncAdm extends Funcionario implements Reembolsavel{
    private String funcaoAdministrativa;
    private String senioridade;


    public FuncAdm(String nome, String cpf, int numRegistro, String orgaoLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    // Métodos da classe
    @Override
    public void aumentarSalario() {
        double salario = getSalario();
        double salarioAumentado = salario + (salario * 0.1);
        setSalario(salarioAumentado);
    }

    @Override
    public void exibirInformacoesComplestas() {
        System.out.print("Informações de Func. Adm. * " + getNome() + " *" +
                "\nCPF: " + getCpf() +
                "\nNúmero de Registro: " + getNumRegistro() +
                "\nÓrgão de Lotação:" + getOrgaoLotacao() +
                "\nSalário: R$" + getSalario() +
                "\nFunção Administrativa: " + getFuncaoAdministrativa() +
                "\nSenioridade: " + getSenioridade());
    }

    @Override
    public double reembolsarDespesas(double valor) {
        return valor;
    }

    // Métodos Get e Set

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }


}
