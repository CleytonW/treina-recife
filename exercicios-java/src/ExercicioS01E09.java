/* Faça um programa que peça a temperatura em graus Fahrenheit, transforme e
mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).

A fórmula de conversão é: 𝐹 = 9 / 5 × 𝐶 + 32
 */

import java.util.Scanner;

public class ExercicioS01E09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o a temperatura em Fahrnheit: "); //perguntar sem tem alguma modo de concatenar para adicionar alguma informação após o valor adicionado
        double grausFahrnheit = sc.nextDouble();

        sc.close();

        double grausCelsius = 5 * ((grausFahrnheit - 32) / 9);

        System.out.printf("A conversão de %.2f° Fahrnheit para Celsius é: %.2f°", grausFahrnheit, grausCelsius); //perguntar se existe um modo de esconder a virgula se o número não real.
        
    }
}
