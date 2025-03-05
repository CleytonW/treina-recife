/* Faça um programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
5% para o sindicato, faça um programa que nos dê:
a. Salário bruto.
b. Quanto pagou ao INSS.
c. Quanto pagou ao sindicato.
d. O salário líquido.
e. Calcule os descontos e o salário líquido. */

import java.util.Scanner;

public class ExercicioS01E20 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("\n Informe quanto você recebe por hora de trabalho: ");
        double pagamentoHoras = sc.nextDouble();

        System.out.print("Informe quantas horas você trabalhou no mês: ");
        double horasMes = sc.nextDouble();

        sc.close();

        double salario = pagamentoHoras * horasMes;
        System.out.printf("Seu salário bruto é R$%.2f\n", salario);

        double impostoRenda = (salario / 100) * 11;
        
        double descontoInss = (salario / 100) * 8;
        System.out.printf("Você pagou R$%.2f ao INSS", descontoInss);

        double descontoSindicato = (salario / 100) * 5;
        System.out.printf("\nVocê pagou R$%.2f ao sindicato", descontoSindicato);

        double descontos = descontoInss + descontoSindicato + impostoRenda;
        double salarioLiquido = salario - descontos;
        System.out.printf("\nSeu salário liquido é R$%.2f", salarioLiquido);

        System.out.printf("\nO valor de descontado do seu sálario é R$%.2f. Somando os desconto com seu salário liquido teria o valor de R$%.2f", descontos, salario);
    }
}
