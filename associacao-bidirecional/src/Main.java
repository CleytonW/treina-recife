// Crie um sistema de controle de alunos e cursos. Cada aluno pode estar matriculado em vários cursos, e cada curso pode ter vários alunos matriculados.

// 1. Crie as classes Aluno e Curso.
// 2. Implemente uma associação bidirecional entre elas.
// 3. Adicione métodos para adicionar/remover alunos de um curso e cursos de um aluno.
// 4. No método main, crie alguns alunos e cursos, estabeleça associações entre eles e exiba os resultados.

public class Main {
    public static void main(String[] args) throws Exception {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");

     
        Curso curso1 = new Curso();
        curso1.setNome("POO");

    
        curso1.addCursoAluno(aluno1);
        aluno1.addAlunoCurso(curso1);

        System.out.println(aluno1.getCursos());
    }
}
