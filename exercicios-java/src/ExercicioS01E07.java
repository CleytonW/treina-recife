/*Faça um programa que calcule a área de um quadrado, em seguida imprima o
dobro desta área para o usuário. A área de um quadrado é dada por 𝐴= 𝐿2 𝐿, onde é o comprimento do lado do quadrado.
*/

import java.util.Scanner;

public class ExercicioS01E07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a área do quadrado: ");
        double area = sc.nextDouble();

        sc.close();

        double areaDobro = Math.pow(area, 2) * 2;

        System.out.printf("O valor da área do quadrado informado foi %.2f logo o dobro do valor é: %.2f", area, areaDobro);

    }
}
