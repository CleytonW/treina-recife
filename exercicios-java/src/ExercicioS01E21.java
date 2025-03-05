/* Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é
de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18
litros, que custam R$ 80,00. Informe ao usuário as quantidades de latas de tinta a
serem compradas e o preço total */

import java.util.Scanner;

public class ExercicioS01E21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da área em metros quadrados: ");
        double tamanhoArea = sc.nextDouble();

        sc.close();

        double litros = tamanhoArea / 3;
        int latasComprar = (int) Math.ceil(litros / 18); // Math.ceil arredonda o valor fracionado para mais e Math.floor para menos

        // if (litros % 18 != 0) {
        //     latasComprar++;
        // }

        double valorTotal = latasComprar * 80;

        // double lataLitros = 18;
        // double lataMetros = 3;
        // double lataPreco = 80;

        // double coberturaTinta = tamanhoArea / lataMetros;
        // double latasComprar = (tamanhoArea / lataMetros) / lataLitros;
        // double valorTotal = ((tamanhoArea / lataMetros)/lataLitros) * lataPreco;
        
        // System.out.printf("Você informou o tamanho de: %.2f", coberturaTinta);
        System.out.printf("\nQuantidade de latas necessarias: %d", latasComprar); //%d é indicado para números inteiros, diferente do %f que é para real
        System.out.printf("\nO valor total de todas as latas é: %.2f", valorTotal);
    }
}
