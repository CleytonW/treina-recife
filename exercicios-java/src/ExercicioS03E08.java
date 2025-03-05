// Faça um programa que leia 5 números e informe a soma e a média dos números

import java.util.Scanner;

public class ExercicioS03E08 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        double soma = 0;

        // while (i < 5) {
        //     System.out.print("Informe o " + (i + 1) + "º número: ");
        //     double numero = sc.nextDouble();
        //     soma += numero;
        //     i++;
        // }

        for (int i = 0; i < 5; i++) {
            System.out.printf("Informe o %dº número: ", i+1);
            double numero = sc.nextDouble();
            soma += numero;
        }

        sc.close();

        double media = soma / 5;
        System.out.print("Soma: " + soma);
        System.out.print("\nMédia: " + media);
    }
}