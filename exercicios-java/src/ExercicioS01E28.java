/* Faça um programa que receba um valor que foi depositado e exiba o valor com
rendimento após um mês. Considere fixo o juro da poupança em 0,50% a.m */

import java.util.Scanner;

public class ExercicioS01E28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o valor a ser depositado: ");
        double deposito = sc.nextDouble();
        
        sc.close();

        double rendimento = (deposito / 100) * 0.50;
        double saldo = rendimento + deposito;

        System.out.printf("O valor do saldo após um mês é de: %.2f", saldo);
    }
}
