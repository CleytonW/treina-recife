/* Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
calcule seu peso ideal, usando a seguinte fórmula: (72.7 * altura) - 58. */

import java.util.Scanner;

public class ExercicioS01E17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Digite a sua altura: ");
        double alturaPessoa = sc.nextDouble();
        
        sc.close();

        double imc = (72.7 * alturaPessoa) - 58;

        System.out.printf("O peso ideal é: %.2fkg", imc);
    }
}
