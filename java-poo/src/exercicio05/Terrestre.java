package exercicio05;

public class Terrestre extends MeioDeTransporte {

    private int qtdRodas;
    private double potencia;

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public double consumo() {
        return potencia * getCargaMaxima() * 100;
    }
}
