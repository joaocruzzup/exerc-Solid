public class Estagiario extends Funcionario implements Reembolsavel{
    private double bolsa;

    public Estagiario(String nome, String cpf, int numRegistro, String orgaoLotacao, double bolsa) {
        super(nome, cpf, numRegistro, orgaoLotacao);
        this.bolsa = bolsa;
    }

    // Métodos da classe
    @Override
    public void exibirInformacoesComplestas() {
            System.out.print("Informações de Estag. * " + getNome() + " *" +
                    "\nCPF: " + getCpf() +
                    "\nNúmero de Registro: " + getNumRegistro() +
                    "\nÓrgão de Lotação:" + getOrgaoLotacao() +
                    "\nBolsa: R$" + getSalario());
    }

    public void aumentarBolsa(){
        this.bolsa = this.bolsa +  (this.bolsa * 0.05);
    }

    @Override
    public double reembolsarDespesas(double valor) {
        return valor;
    }

    // Métodos Get e Set
    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

}
