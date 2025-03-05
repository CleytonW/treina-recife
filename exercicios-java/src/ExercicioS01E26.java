// Faça um programa para ler dois valores nas variáveis A e B, e efetuar as trocas dos
// valores de forma que a variável A passe a possuir o valor da variável B e a variável
// B passe a possuir o valor da variável A. Apresentar os valores trocados

import java.util.Scanner;

public class ExercicioS01E26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, conversor;

        System.out.print("Informe o valor A: ");
        a = sc.nextDouble();

        System.out.print("Informe o valor B: ");
        b = sc.nextDouble();

        sc.close();

        conversor = b;
        b = a;
        a = conversor; 

        System.out.printf("Você informou que A = %.2f e B = %.2f", a, b);

    }
}
