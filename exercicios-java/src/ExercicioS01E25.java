// Faça um programa que peça 2 números inteiros e um número real. Calcule e mostre:
// a. O produto do dobro do primeiro com metade do segundo.
// b. A soma do triplo do primeiro com o terceiro.
// c. O terceiro elevado ao cubo

import java.util.Scanner;

public class ExercicioS01E25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o primeiro número inteiro: ");
        int inteiro1 = sc.nextInt();

        System.out.printf("Informe o segundo número inteiro: ");
        int inteiro2 = sc.nextInt();

        System.out.printf("Informe o número real: ");
        double numeroReal = sc.nextDouble();

        sc.close();
        
        double questaoA = (inteiro1 * 2) * (inteiro2 / 2);
        double questaoB = (inteiro1 * 3) + numeroReal;
        double questaoC = Math.pow(numeroReal, 3);

        System.out.printf("\n O produto do dobro do primeiro com a metade do segundo é: %.2f", questaoA);
        System.out.printf("\nA soma do triplo do primeiro com o terceiro é: %.2f", questaoB);
        System.out.printf("\nO valor do numero real ao cubo é: %.2f", questaoC);
    }
}
