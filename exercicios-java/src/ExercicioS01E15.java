/* Implemente um programa em Java que receba o raio da base e a altura de um
cone e retorne seu volume. A fórmula do volume do cone é: 𝑉 = 1 / 3 × 𝜋 × 𝑟² × ℎ */

import java.util.Scanner;

public class ExercicioS01E15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Digit o valor raio da base: ");
        double raioBase = sc.nextDouble();

        System.out.print("Digit o valor da altura: ");
        double altura = sc.nextDouble();

        sc.close();

        double volume = (1.0 / 3) * Math.PI * Math.pow(raioBase, 2) * altura; //java não me dava resultado fracionado na divisão, tive que altera "1 / 3" para "1.0 / 3" e assim conseguir resultado exato sem arredondar.

        System.out.printf("O volume do cone é: %.2f", volume);
    }
}
