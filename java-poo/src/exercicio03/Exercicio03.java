package exercicio03;

import java.util.ArrayList;
import java.util.List;
// import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // List<Turma> turmas = new ArrayList<>();

        // System.out.println("Digite o número de turma a serem cadastradas:");
        // int numTurmas = sc.nextInt();

        // sc.nextLine();

        // for (int i = 0; i < numTurmas; i++) {
        //     System.out.println("Digite o código da turma: ");
        //     String codigo = sc.nextLine();

        //     System.out.println("Digite o 'id' da sala: ");
        //     Integer salaId = sc.nextInt();

        //     System.out.println("Digite o 'id' do turno: ");
        //     Integer turnoId = sc.nextInt();

        //     sc.nextLine();

        //     Turma turma = new Turma(codigo, salaId, turnoId);
        //     turmas.add(turma);
        // }

        // sc.close();

        Aluno aluno1 = new Aluno();

        aluno1.setNome("Cleyton Melo");
        aluno1.setMatricula("123");

        Aluno aluno2 = new Aluno();

        aluno2.setNome("Iohana Gama");
        aluno2.setMatricula("456");
        
        Turma turma1 = new Turma();

        turma1.setCodigo("Full Stack 04");
        turma1.setSala(2);
        turma1.setTurno(3);
        turma1.setAlunos(null);

        aluno1.setTurma(turma1);
        aluno2.setTurma(turma1);
        
        List<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);

        turma1.setAlunos(listaAlunos);

        System.out.println(turma1.getAlunos());

    }

}
