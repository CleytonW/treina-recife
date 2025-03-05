/* Implemente um programa em Java que receba o comprimento da aresta de um
cubo e retorne seu volume. A fórmula do volume do cubo é: 𝑉 = 𝑎𝑟𝑒𝑠𝑡𝑎³ */

import java.util.Scanner;

public class ExercicioS01E14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento da aresta: ");
        double aresta = sc.nextDouble();

        sc.close();

        double volume = Math.pow(aresta, 2);

        System.out.printf("O valor do volume é: %.2f", volume);
    }
}
