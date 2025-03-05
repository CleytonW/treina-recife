// Implemente um programa em Java que receba um número inteiro positivo do
// usuário e retorne o fatorial desse número. Lembre-se que: o fatorial de um número
// “n” é o produto de todos os inteiros de 1 a “n”.
// Exemplo: 5! = 5 x 4 x 3 x 2 x 1 = 120

import java.util.Scanner;

public class ExercicioS03E16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o valor: ");
        int n = sc.nextInt();

        sc.close();

        int fatorial = 1;

        for (int i = n; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.print("O valor do fatoria de " + n + " é: " + fatorial);

    }
}
