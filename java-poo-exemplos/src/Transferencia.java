import java.time.LocalDateTime;

public class Transferencia {

    private Conta contaOrigem;
    private double valor;
    private LocalDateTime dataHora;
    private Conta contaDestino;

    public Transferencia() {

    }

    public Transferencia(Conta contaOrigem, double valor, LocalDateTime dataHora, Conta contaDestino) {
        this.contaOrigem = contaOrigem;
        this.valor = valor;
        this.dataHora = dataHora;
        this.contaDestino = contaDestino;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

}
