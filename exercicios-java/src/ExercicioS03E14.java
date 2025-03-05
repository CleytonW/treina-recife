// Implemente um programa em Java que receba do usuário dois números inteiros
// distintos e retorne a quantidade de números pares que existem entre esses dois
// números, excluindo os próprios números

import java.util.Scanner;

public class ExercicioS03E14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nInforme o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Informe o segundo valor: ");
        int valor2 = sc.nextInt();

        sc.close();

        int par = 0;

        for (int i = valor1; i < valor2; i++) {
            if (i > valor1) {
                if (i % 2 == 0) {
                    par++;
                }
            }
        }

        System.out.print(par);
    }
}
