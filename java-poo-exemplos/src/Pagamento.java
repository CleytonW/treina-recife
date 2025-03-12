import java.time.LocalDateTime;

public class Pagamento {
    private Conta contaOrigem;
    private String modo;
    private double valor;
    private LocalDateTime dataHora;
    private String descricao;
    private Conta contaDestino;

    public Pagamento() {

    }

    public Pagamento(Conta contaOrigem, String modo, double valor, LocalDateTime dataHora, String descricao,
            Conta contaDestino) {
        this.contaOrigem = contaOrigem;
        this.modo = modo;
        this.valor = valor;
        this.dataHora = dataHora;
        this.descricao = descricao;
        this.contaDestino = contaDestino;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

}
