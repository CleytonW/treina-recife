
import java.util.Date;

public class Aluno {

    private String matricula;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String sexo;
    private String enderco;
    private String uf;
    private Turma turma;

    //método construtor padrão
    public Aluno() {

    }

    //método construtor com todos os argumentos
    public Aluno(String cpf, Date dataNascimento, String enderco, String matricula, String nome, String sexo, String uf, Turma turma) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.enderco = enderco;
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.uf = uf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEnderco() {
        return enderco;
    }

    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }


}
