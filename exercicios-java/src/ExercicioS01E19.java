/* João Papo-de-Pescador, homem de bem, comprou um microcomputador para
controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
(50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
você faça um programa que leia a variável peso (peso de peixes) e calcule o
excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável
multa o valor da multa que João deverá pagar. Imprima os dados do programa com
as mensagens adequadas. */

import java.util.Scanner;

public class ExercicioS01E19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade peso de peixe: ");
        double pesoPeixe = sc.nextDouble();

        sc.close();

        double excesso = pesoPeixe - 50; 
        double multa = excesso * 4;

        System.out.printf("Você passou %.2fkg do peso, logo precisa pagar R$%.2f de multa", excesso, multa);

    }
}
