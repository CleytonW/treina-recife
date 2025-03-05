/* Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é
de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18
litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00. Informe
ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3
situações:
● Comprar apenas latas de 18 litros;
● Comprar apenas galões de 3,6 litros;
● Misturar latas e galões, de forma que o desperdício de tinta seja menor.
Acrescente 10% de folga e sempre arredonde os valores para cima, isto é,
considere latas cheias. */

import java.util.Scanner;

public class ExercicioS01E22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da área em metros quadrados: ");
        double tamanhoArea = sc.nextDouble();

        sc.close();

        double litros = 1.1 * tamanhoArea / 6;

        // Situação 1: Compras apenas latas de 18 litros
        int latasComprar = (int) Math.ceil(litros / 18);
        double valorTotalLatas = latasComprar * 80;

        // Situação 2: Compras apenas galão de 3.6 litros
        int galoesComprar = (int) Math.ceil(litros / 3.6);
        double valorTotalGaloes = galoesComprar * 25;

        // Situação 3: Misturar latas e gallões
        // Cálculo da quantidade de latas
        int latasComprar3 = (int) litros / 18;

        //Cálculo da quantidade de galões
        double resto = litros % 18;
        int galoesComprar3 = (int) Math.ceil(resto / 3.6);

        // Cálculo valor total
        double valorTotalMistura = latasComprar3 * 80 + galoesComprar3 * 25;


        System.out.println("SITUAÇÃO 1:");
        System.out.printf("Você precisa de %d latas de tinta. \n", latasComprar);    
        System.out.printf("Total #1: R$ %.2f \n", valorTotalLatas);

        System.out.println("SITUAÇÃO 2:");
        System.out.printf("Você precisa de %d galões de tinta. \n", galoesComprar);    
        System.out.printf("Total #2: R$ %.2f \n", valorTotalGaloes);

        System.out.println("SITUAÇÃO 3:");
        System.out.printf("Você precisa de %d latas de tinta. \n", latasComprar3);    
        System.out.printf("Você precisa de %d galões de tinta. \n", galoesComprar3);    
        System.out.printf("Total #3: R$ %.2f \n", valorTotalMistura);
           
    }
}
