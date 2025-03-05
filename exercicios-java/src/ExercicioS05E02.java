
import java.util.Scanner;

public class ExercicioS05E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe o número de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.print("Informe o valor que que recebe por horas: ");
        double valorHoras = sc.nextDouble();

        sc.close();

        double salario = horasTrabalhadas * valorHoras;

        System.out.printf("Funcionário é: %s e seu sálario é: %.2f", nome, salario);


    }
}
