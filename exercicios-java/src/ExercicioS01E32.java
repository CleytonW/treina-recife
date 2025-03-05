/* Faça um programa que receba o preço de custo de um produto e mostre o valor de
venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um
percentual informado pelo usuário. */

import java.util.Scanner;

public class ExercicioS01E32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o preço do produto: ");
        double precoProduto = sc.nextDouble();

        System.out.print("Informe o valor de acréscimo do produto: ");
        double acrescimoProduto = sc.nextDouble();

        sc.close();

        double valorVenda = ((acrescimoProduto / 100) * precoProduto) + precoProduto;


        System.out.println(valorVenda);


    }
}
