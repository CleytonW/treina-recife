/* Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total
de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor
ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o
salário fixo e salário no final do mês */

import java.util.Scanner;

public class ExercicioS01E30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o nome do vendedor: ");
        String nome = sc.nextLine();

        System.out.print("Informe o valor do salário fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Informe o total das vendas realizadas por ele: ");
        double totalVendas = sc.nextDouble();

        sc.close();

        double comissao = (totalVendas / 100) * 15;
        double salarioTotal = comissao + salarioFixo;

        System.out.printf("\nO vendedor %s teve o salário fixo de R$%.2f e somando as vendas com o valor fixo teve um pagamento de R$%.2f como salário final no mês.", nome, salarioFixo, salarioTotal);
    }
}
