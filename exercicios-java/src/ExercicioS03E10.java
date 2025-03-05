// Faça um programa que receba dois números inteiros e gere os números inteiros que
// estão no intervalo compreendido por eles

import java.util.Scanner;

public class ExercicioS03E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = sc.nextInt();

        // int inicio = Math.min(numero1, numero2);
        // int fim = Math.max(numero1, numero2);

        // while (numero1 != numero2) {
        //     if (numero1 < numero2) {
        //         numero1 += 1;
        //         System.out.println(numero1);
        //     } else {
        //         numero1 -= 1;
        //         System.out.println(numero1);
        //     }
        // }

        // while (inicio <= fim) {
        //     System.out.println(inicio);
        //     inicio++;
        // }

        int valorInicio, valorFinal;

        if (numero1 < numero2) {
            valorInicio = numero1;
            valorFinal = numero2;
        } else {
            valorInicio = numero2;
            valorFinal = numero1;
        }

        for (int i = valorInicio + 1; i < valorFinal; valorInicio++) {
            System.out.println(valorInicio);
        }

        sc.close();
    }
}
