/* Implemente um programa em Java que receba a largura e a altura de um retângulo
e imprima sua área. A fórmula da área do retângulo é: 𝐴 = 𝑙𝑎𝑟𝑔𝑢𝑟𝑎 × 𝑎𝑙𝑡𝑢𝑟𝑎. */

import java.util.Scanner;

public class ExercicioS01E13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Digite a largura do retângulo: ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        sc.close();

        double area = largura * altura;

        System.out.printf("O valor da área do retângulo é: %.2f", area);
    }
}
