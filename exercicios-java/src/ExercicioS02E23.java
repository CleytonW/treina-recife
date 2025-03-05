// Faça um programa que leia 2 números e em seguida pergunte ao usuário qual
// operação ele deseja realizar (soma, subtração, multiplicação ou divisão). O
// resultado da operação deve ser acompanhado de uma frase que diga se:
// ● O número é par ou ímpar;
// ● O número é positivo ou negativo;

import java.util.Scanner;

public class ExercicioS02E23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = sc.nextInt();

        System.out.println("Operações: ");
        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");
        System.out.print("\nEscolha uma das opções informadas: ");
        int operacao = sc.nextInt();

        while (operacao < 1 || operacao > 4) {
            System.out.print("Operação inválida. Escolha uma das opções informadas: ");
            operacao = sc.nextInt();
        }


            switch (operacao) {
                case 1:
                    System.out.printf("%d + %d = %d", numero1, numero2, numero1 + numero2);
                    break;
                case 2:
                    System.out.printf("\n%d - %d = %d", numero1, numero2, numero1 - numero2);
                    break;
                case 3:
                    System.out.printf("\n%d x %d = %d", numero1, numero2, numero1 * numero2);
                    break;
                case 4:
                    double resultado = (double) numero1 / numero2;
                    System.out.printf("\n%d ÷ %d = %.2f", numero1, numero2, resultado);
                    break;
            }


        sc.close();
    }
}
