/*Faça um programa que peça o raio de um círculo, calcule e imprima sua área. A
área de um círculo é dada por 𝐴 = 2 × π × 𝑅(2) , onde é o raio do círculo. Considere π = 3,14. 
*/

import java.util.Scanner;

public class ExercicioS01E06 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        sc.close();

        double area = 2 * 3.14 * Math.pow(raio, 2);

        System.out.printf("A área do círculo é: %2.f", area);
    }
}
