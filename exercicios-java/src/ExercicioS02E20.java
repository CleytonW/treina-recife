// Faça um programa para leitura de três notas parciais de um aluno. O programa
// deve calcular a média alcançada por aluno e presentar:
// ● A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva
// média alcançada;
// ● A mensagem "Reprovado", se a média for menor do que 7, com a respectiva
// média alcançada;
// ● A mensagem "Aprovado com Mérito", se a média for igual a 10.

import java.util.Scanner;

public class ExercicioS02E20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Informe a terceira nota:");
        double nota3 = sc.nextDouble();

        sc.close();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7 && media < 10) {
            System.out.printf("Aprovado! Média: %.1f", media);
        } else if (media == 10) {
            System.out.printf("Aprovado com Mérito! Média: %.1f", media);
        } else if (media < 7) {
            System.out.printf("Reprovado! Média: %.1f", media);
        }
    }
}
