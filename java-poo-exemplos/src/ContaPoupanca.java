public class ContaPoupanca extends Conta {
    
    private double taxaJuros;
    private int diaAniversario;

    public ContaPoupanca() {

    }

    public ContaPoupanca(double taxaJuros, int diaAniversario) {
        this.taxaJuros = taxaJuros;
        this.diaAniversario = diaAniversario;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public void sacar(double valor) {
        double saldoAtual = this.getSaldo();

        if (saldoAtual >= 1.15 * valor) {
            double desconto = 0.15 * valor;
            double novoSaldo = saldoAtual - desconto - valor;
            this.setSaldo(novoSaldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
