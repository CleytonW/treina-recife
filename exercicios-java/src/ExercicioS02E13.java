// Faça um programa que leia um número e exiba o dia correspondente da semana:
// (1-Domingo, 2- Segunda, etc.). Se o usuário digitar outro valor, o programa deverá
// imprimir a mensagem “Valor inválido”.

import java.util.Scanner;

public class ExercicioS02E13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o número de 1 à 7, correspondente para o dia da semana: ");
        int diaSemana = sc.nextInt();

        sc.close();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Segunda!");
                break;
            case 3:
                System.out.println("Terça!");
                break;
            case 4:
                System.out.println("Quarta!");
                break;
            case 5:
                System.out.println("Quinta!");
            case 6:
                System.out.println("Sexta!");
                break;
            case 7:
                System.out.println("Sábado!");
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }

    }
}
