import java.util.List;

public class Turma {
    private String codigo;
    private Integer turno;
    private Integer sala;
    private List<Aluno> alunos;

    //método construtor padrão
    public Turma(){

    }

    //método construtor com todos os argumentos
    public Turma(String codigo, Integer turno, Integer sala) {
        this.codigo = codigo;
        this.turno = turno;
        this.sala = sala;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getTurno() {
        return turno;
    }

    public void setTurno(Integer turno) {
        this.turno = turno;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }
    
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int getNumeroAlunoMatriculados() {
        return alunos.size();
    }


}
