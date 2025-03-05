/* A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações
sem juros. Faça um programa que receba um valor de uma compra e mostre o valor
das prestações */

import java.util.Scanner;

public class ExercicioS01E29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("\nInforme o valor da compra realizada: ");
        double compra = sc.nextDouble();

        sc.close();

        double parcela1 = compra / 1;
        double parcela2 = compra / 2;
        double parcela3 = compra / 3;
        double parcela4 = compra / 4;
        double parcela5 = compra / 5;
        
        System.out.printf("A compra pode ser em 1x de R$%.2f\n 2x de R$%.2f\n 3x de R$%.2f\n 4x de R$%.2f\n 5x de R$%.2f", parcela1, parcela2, parcela3, parcela4, parcela5);

    }
}
