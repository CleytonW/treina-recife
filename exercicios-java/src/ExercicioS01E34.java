/* Dado um número inteiro, positivo e menor do que 1000, imprimir a quantidade de
centenas, dezenas e unidades desse número.
Exemplo: Dado o número 764, imprimir:
Centena = 7, Dezena = 6 e Unidade = 4 */

import java.util.Scanner;

public class ExercicioS01E34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Informe um número inteiro positivo menor que 1000: ");
        int numero = sc.nextInt();

        sc.close();

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = (numero % 100) % 10;

        System.out.printf("\nO valor das centenas = %d, dezenas = %d e unidades = %d", centenas, dezenas, unidades);

    }
}
