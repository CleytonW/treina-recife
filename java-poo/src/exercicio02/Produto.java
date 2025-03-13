package exercicio02;

import java.time.LocalDate;
import java.time.Period;

public class Produto {

    // atributos
    private Integer id;
    private String nome;
    private String descricao;
    private LocalDate validade;

    // métodos
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public int calcularDiasRestante() {

        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataAtual, validade);

        return periodo.getDays();
    }

}
