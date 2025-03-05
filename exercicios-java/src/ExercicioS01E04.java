// Faça um programa que peça as 4 notas bimestrais de um aluno e imprima a média

import java.util.Scanner;

public class ExercicioS01E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Informe a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Informe a quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A media bimestral do aluno é: %.2f", media);

        sc.close();
    }
}
