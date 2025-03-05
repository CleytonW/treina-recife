// Faça um programa que peça um número e então mostre a mensagem:
// O número informado foi [número].

import java.util.Scanner;

public class ExercicioS01E02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numero = sc.nextDouble();

        System.out.printf("O número informado foi: %.1f", numero);

        sc.close();
    }
}