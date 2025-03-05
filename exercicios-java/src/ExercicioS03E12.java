// Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
// inteiro entre 1 a 10. O usuário deve informar de qual número e qual operação
// matemática (soma, subtração, multiplicação ou divisão) ele deseja ver a tabuada

import java.util.Scanner;

public class ExercicioS03E12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme um número de 1 a 10: ");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 10) {
            System.out.println("Valor inválido!");
        }

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

        System.out.print("Tabuada do número " + numero + ": ");

        int contador = 1;

        while (contador <= 10) {
            switch (operacao) {
                case 1:
                    System.out.printf("%d + %d = %d", numero, contador, numero + contador);
                    break;
                case 2:
                    System.out.printf("\n%d - %d = %d", numero, contador, numero - contador);
                    break;
                case 3:
                    System.out.printf("\n%d x %d = %d", numero, contador, numero * contador);
                    break;
                case 4:
                    double resultado = (double) numero / contador;
                    System.out.printf("\n%d ÷ %d = %.1f", numero, contador, resultado);
                    break;
            }
            contador++;
        }

        sc.close();
    }
}
