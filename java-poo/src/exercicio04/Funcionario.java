package exercicio04;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Funcionario {

    private Integer matricula;
    private String nomeCompleto;
    private String cpf;
    private LocalDate dataNascimento;
    private Integer sexo;
    private double salario;
    private int telefone;
    private List<Dependete> dependente;

    public Funcionario() {

    }

    public Funcionario(Integer matricula, String nomeCompleto, String cpf, LocalDate dataNascimento, Integer sexo,
            double salario, int telefone) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.salario = salario;
        this.telefone = telefone;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public List<Dependete> getDependente() {
        return dependente;
    }

    public void setDependente(List<Dependete> dependente) {
        this.dependente = dependente;
    }

    public Integer calcularIdade() {
        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataNascimento, dataAtual);

        return periodo.getYears();
    }
}
