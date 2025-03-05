/* Implemente um programa em Java que receba um valor em quilogramas e retorne
o valor equivalente em libras. Considere que 1 kg é equivalente a 2,20462 libras. */

import java.util.Scanner;

public class ExercicioS01E16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Digite o valor de quilogramas: ");
        double kg = sc.nextDouble();

        sc.close();

        double valorLibras = kg * 2.20462;

        System.out.printf("A conversão de %.2fkg é: %.5f", kg, valorLibras);

    }
}