/* Implemente um programa em Java que receba a base e a altura de um triângulo e
imprima sua área. A fórmula da área do triângulo é dada por: 𝐴 = 𝑏𝑎𝑠𝑒 × 𝑎𝑙𝑡𝑢𝑟𝑎 / 2. */

import java.util.Scanner;

public class ExercicioS01E11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Digite o base da triângulo: ");
        double baseTriangulo = sc.nextDouble();

        System.out.print("\n Digite o altura da triângulo: ");
        double alturaTriangulo = sc.nextDouble();

        sc.close();

        double area = (baseTriangulo * alturaTriangulo) / 2;

        System.out.printf("O a área do triângulo é: %.2f", area);
    }
}
