/* Faça um programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e imprima o total do seu salário no referido mês. */

import java.util.Scanner;

public class ExercicioS01E08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Informe quanto você recebe por hora de trabalho: ");
        double pagamentoHoras = sc.nextDouble();

        System.out.print("Informe quantas horas você trabalhou no mês: ");
        double horasMes = sc.nextDouble();

        sc.close();

        double salario = pagamentoHoras * horasMes;

        System.out.printf("Seu salário mensal é: %.2f", salario);
    }
}
