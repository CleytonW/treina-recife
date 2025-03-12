public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;
    private double taxaManutencao;
    private int numeroSaquesGratis;

    public ContaCorrente() {

    }

    public ContaCorrente(double limiteChequeEspecial, double taxaManutencao, int numeroSaquesGratis) {
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.taxaManutencao = taxaManutencao;
        this.numeroSaquesGratis = numeroSaquesGratis;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public int getNumeroSaquesGratis() {
        return numeroSaquesGratis;
    }

    public void setNumeroSaquesGratis(int numeroSaquesGratis) {
        this.numeroSaquesGratis = numeroSaquesGratis;
    }

    @Override
    public void sacar(double valor) {
        double saldoAtual = this.getSaldo();

        if (saldoAtual >= 1.10 * valor) {
            double desconto = 0.10 * valor;
            double novoSaldo = saldoAtual - desconto - valor;
            this.setSaldo(novoSaldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

}
