/*
 * Implemente um programa em Java que receba o raio de uma esfera e retorne seu
volume. A fórmula do volume de uma esfera é dado por: 𝑉 = 4 / 3 × 𝜋 × 𝑟³
 */



import java.util.Scanner;

public class ExercicioS01E10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Digite o raio da esfera: ");
        double raio = sc.nextDouble();

        sc.close();

        // double divisaoFormula = 4 / 3; perguntar o porque essa divisão dá o valor exato de 1,000 e não o de 1,3333333
        double volume = (4.0 / 3) * 3.14 * Math.pow(raio, 3); // tive que colocar 4.0 na divisão para forçar o java a me dar o número fracionado, sem arredondar.

        System.out.printf("O volume da esfera é: %.2f", volume);
    }
}