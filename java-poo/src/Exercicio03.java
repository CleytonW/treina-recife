
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Turma> turmas = new ArrayList<>();

        System.out.println("Digite o número de turma a serem cadastradas:");
        int numTurmas = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < numTurmas; i++) {
            System.out.println("Digite o código da turma: ");
            String codigo = sc.nextLine();

            System.out.println("Digite o 'id' da sala: ");
            Integer salaId = sc.nextInt();

            System.out.println("Digite o 'id' do turno: ");
            Integer turnoId = sc.nextInt();

            sc.nextLine();

            Turma turma = new Turma(codigo, salaId, turnoId);
            turmas.add(turma);
        }

        sc.close();

        System.out.println("Quantidade de turmas: " + turmas.size());

    }

}
