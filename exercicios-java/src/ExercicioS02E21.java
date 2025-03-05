// Faça um programa para um caixa eletrônico. O programa deverá perguntar ao
// usuário o valor do saque e depois informar quantas notas de cada valor serão
// fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é
// de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a
// quantidade de notas existentes na máquina.
// Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de
// 100, uma nota de 50, uma nota de 5 e uma nota de 1;
// Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de
// 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

import java.util.Scanner;

public class ExercicioS02E21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nDigite o valor do saque: ");
    int saque = sc.nextInt();

    while (saque < 10 || saque >= 601) {
      System.out.print("Valor inválido. Valor mínimo de R$10 e máximo de R$600. \nDigite o valor do saque: ");
      saque = sc.nextInt();
    }

    int notas100 = saque / 100;
    int resto100 = saque % 100;

    int notas50 = resto100 / 50;
    int resto50 = resto100 % 50;

    int notas10 = resto50 / 10;
    int resto10 = resto50 % 10;

    int notas5 = resto10 / 5;
    int resto5 = resto10 % 5;

    int notas1 = resto5;

    if (notas100 > 0) {
      System.out.printf("%d nota(s) de 100", notas100);
    }
    if (notas50 > 0) {
      System.out.printf("\n%d nota(s) de 50", notas50);
    } 
    if (notas10 > 0) {
      System.out.printf("\n%d nota(s) de 10", notas10);
    } 
    if (notas5 > 0) {
      System.out.printf("\n%d nota(s) de 5", notas5);
    } 
    if (notas1 > 0) {
      System.out.printf("\n%d nota(s) de 1", notas1);
    } 

    sc.close();
    
  }
}
