// Faça um programa que receba dois números inteiros e gere os números inteiros que
// estão no intervalo compreendido por eles
// Altere o programa anterior para mostrar no final a soma dos números.

import java.util.Scanner;

public class ExercicioS03E11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        System.out.print("\nInforme o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = sc.nextInt();

        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);
        int soma = 0;


        while (inicio <= fim) {
            System.out.println(inicio);
            soma += inicio;
            inicio++;
        }

        System.out.println("A soma é: " + soma);

        sc.close();
    }
}
