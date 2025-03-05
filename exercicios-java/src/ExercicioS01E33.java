/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre
o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado).
Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%.
Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao
consumidor do mesmo. */

import java.util.Scanner;

public class ExercicioS01E33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Informe o custo de fábrica do carro (R$): ");
        double custoFabrica = sc.nextDouble();

        sc.close();

        double valorFinalFabricacao = (custoFabrica * 0.45) + custoFabrica;
        double custoConsumidor = (valorFinalFabricacao * 0.28) + valorFinalFabricacao;

        System.out.printf("O custo para o consumidor é de R$ %.2f", custoConsumidor);
    }
}
