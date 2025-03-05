/* Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias
e mostre-a expressa apenas em dias, suponha todos os meses com 30 dias */

import java.util.Scanner;

public class ExercicioS01E31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite a idade em anos: ");
        int idadeAnos = sc.nextInt();

        System.out.print("Digite a idade em meses: ");
        int idadeMeses = sc.nextInt();

        System.out.print("Digite a idade em dias: ");
        int idadeDias = sc.nextInt();

        sc.close();

        int idadeTotalDias = idadeAnos * 365 + idadeMeses * 30 + idadeDias;

        System.out.printf("A idade total em dia é de: %d", idadeTotalDias);
    }
}
