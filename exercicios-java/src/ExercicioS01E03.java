//Faça um programa que peça dois números e imprima a soma.  

import java.util.Scanner;

public class ExercicioS01E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Informe o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = sc.nextDouble();

        double soma = numero1 + numero2;

        System.out.printf("A soma dos números informado é: %.2f", soma);

        sc.close();
    }
}
