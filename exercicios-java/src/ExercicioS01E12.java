/* Implemente um programa em Java que receba o raio da base e a altura de um
cilindro e retorne seu volume. A fórmula do volume do cilindro é: 𝑉 = 𝜋 × 𝑟² × ℎ. */


import java.util.Scanner;

public class ExercicioS01E12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Digite o base da cilindro: ");
        double raioBase = sc.nextDouble();

        System.out.print("\n Digite o altura da triângulo: ");
        double alturaCilindro = sc.nextDouble();

        sc.close();

        double volume = 3.14 * Math.pow(raioBase, 2) * alturaCilindro;

        System.out.printf("O volume da cilindro é: %.2f", volume);

    }
}
