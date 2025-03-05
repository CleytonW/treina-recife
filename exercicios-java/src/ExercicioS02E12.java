// Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
// descontos são do Imposto de Renda, que depende do salário bruto (conforme
// tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário
// Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido
// corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao
// usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
// Desconto do IR:
// ● Salário Bruto até R$ 900 (inclusive): isento;
// ● Salário Bruto até R$ 1500 (inclusive): desconto de 5%;
// ● Salário Bruto até R$ 2500 (inclusive): desconto de 10%;
// ● Salário Bruto acima de 2500 - desconto de 20%
// Imprima na tela as informações, dispostas conforme o exemplo a seguir. No
// exemplo o valor da hora é R$ 5 e a quantidade de horas trabalhadas é 220.
// Salário Bruto: R$ 5 * 220 = R$ 1100,00
// (-) IR (5%) : R$ 55,00
// (-) INSS (10%) : R$ 110,00
// (-) FGTS (11%): R$ 121,00
// Total de descontos: R$ 165,00
// Salário Líquido: R$ 935,00


import java.util.Scanner;

public class ExercicioS02E12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o valor das horas: ");
        double valorHoras = sc.nextDouble();

        System.out.print("Digite a quantidade de horas que trabalhou no mês: ");
        double horasMes = sc.nextDouble();

        sc.close();

        double salarioBruto = valorHoras * horasMes;
        double impostoRenda = 0;

        if (salarioBruto > 900.00 && salarioBruto <= 1500 ) {
            impostoRenda = 0.05 * salarioBruto;     
        } else if (salarioBruto > 1500.00 && salarioBruto <= 2500) {
            impostoRenda = 0.10 * salarioBruto;
        } else if (salarioBruto > 2500.00) {
            impostoRenda = 0.20 * salarioBruto;
        } 
        
        double impostoSindicato = 0.03 * salarioBruto;
        double fgts = 0.11 * salarioBruto;
        double totalDescontos = impostoSindicato + impostoRenda;
        double salarioLiquido = salarioBruto - totalDescontos;


        System.out.printf("\nSalário Bruto: R$%.2f", salarioBruto);
        System.out.printf("\nIR: R$%.2f", impostoRenda);
        System.out.printf("\nFGTS: R$%.2f", fgts);
        System.out.printf("\nTotal de descontos: R$%.2f", totalDescontos);
        System.out.printf("\nSalário Líquido: R$%.2f", salarioLiquido); 
    }
    
}