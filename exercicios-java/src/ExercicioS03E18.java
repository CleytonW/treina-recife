// Implemente um programa em Java que continue solicitando ao usuário números
// inteiros até que ele digite zero. O programa deve então calcular e imprimir a média
// de todos os números digitados (excluindo o zero)

import java.util.Scanner;

public class ExercicioS03E18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media = 0;
        double soma = 0;

        System.out.print("\nInforme o número inteiro: ");
        int numero = sc.nextInt();

        soma += numero;

        while (numero > 0) {
            System.out.print("Informe o número inteiro: ");
            numero = sc.nextInt();
        }


        for(int i = numero; i < 0; i++) {
            media = (soma / i);
        }

        System.out.print("A média é: " + media);

        sc.close();
    }
}
