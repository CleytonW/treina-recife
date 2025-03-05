/* Faça um programa que receba dois números e ao final mostre a soma, subtração,
multiplicação e a divisão dos números lidos */

import java.util.Scanner;

public class ExercicioS01E24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = sc.nextDouble();

        sc.close();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.printf("\nA soma dos valores informados é %.2f", soma);
        System.out.printf("\nA subtração dos valores informados é %.2f", subtracao);
        System.out.printf("\nA multiplicação dos valores informados é %.2f", multiplicacao);
        System.out.printf("\nA divisão dos valores informados é %.2f", divisao);
    }
}
