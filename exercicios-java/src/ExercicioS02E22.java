// Faça um programa que peça um número inteiro e determine se ele é par ou ímpar

import java.util.Scanner;

public class ExercicioS02E22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite um número inteiro: ");
        int numero = sc.nextInt();
        
        sc.close();

        System.out.println((numero % 2 == 0) ? "Par" : "Impar");
    }
}
