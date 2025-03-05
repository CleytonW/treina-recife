// As Organizações Tabajara resolveram dar um aumento de salário aos seus
// colaboradores e lhe contrataram para desenvolver o programa que irá calcular os
// reajustes. Faça um programa que recebe o salário atual de um colaborador e o
// reajuste segundo o seguinte critério, baseado no salário atual:
// ● Salários até R$ 280,00 (inclusive): aumento de 20%;
// ● Salários entre R$ 280,00 e R$ 700,00 (inclusive): aumento de 15%;
// ● Salários entre R$ 700,00 e R$ 1500,00 (inclusive) : aumento de 10%;
// ● Salários maiores que R$ 1500,00: aumento de 5%.
// Após o aumento ser realizado, informe na tela:
// a. O salário antes do reajuste;
// b. O percentual de aumento aplicado;
// c. O valor do aumento;
// d. O novo salário, após o aumento.

import java.util.Scanner;

public class ExercicioS02E11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("\nInforme o salário atual: ");
        double salarioAtual = sc.nextDouble();

        sc.close();


        if (salarioAtual <= 280.00) {
            
            double aumentoValor = salarioAtual * 0.20;
            int valorPercentual = 20;
            double novoSalario = salarioAtual + aumentoValor;


            System.out.printf("\nO salário antes do reajuste: %.2f", salarioAtual);
            System.out.print("\nPercentual do aumento: " + valorPercentual +"%");
            System.out.printf("\nValor do aumento salarial: %.2f", aumentoValor);
            System.out.printf("\nO salário com reajuste fica: %.2f", novoSalario);

        } else if (salarioAtual > 280.00 && salarioAtual <= 700.00) {

            double aumentoValor = salarioAtual * 0.15;
            int valorPercentual = 15;
            double novoSalario = salarioAtual + aumentoValor;


            System.out.printf("\nO salário antes do reajuste: %.2f", salarioAtual);
            System.out.print("\nPercentual do aumento: " + valorPercentual +"%");
            System.out.printf("\nValor do aumento salarial: %.2f", aumentoValor);
            System.out.printf("\nO salário com reajuste fica: %.2f", novoSalario);

        } else if (salarioAtual > 700.00 && salarioAtual <= 1500.00) {

            double aumentoValor = salarioAtual * 0.10;
            int valorPercentual = 10;
            double novoSalario = salarioAtual + aumentoValor;


            System.out.printf("\nO salário antes do reajuste: %.2f", salarioAtual);
            System.out.print("\nPercentual do aumento: " + valorPercentual +"%");
            System.out.printf("\nValor do aumento salarial: %.2f", aumentoValor);
            System.out.printf("\nO salário com reajuste fica: %.2f", novoSalario);

        } else {

            double aumentoValor = salarioAtual * 0.05;
            int valorPercentual = 5;
            double novoSalario = salarioAtual + aumentoValor;


            System.out.printf("\nO salário antes do reajuste: %.2f", salarioAtual);
            System.out.print("\nPercentual do aumento: " + valorPercentual +"%");
            System.out.printf("\nValor do aumento salarial: %.2f", aumentoValor);
            System.out.printf("\nO salário com reajuste fica: %.2f", novoSalario);

        }
    }
}
