// Faça um programa que calcule as raízes de uma equação do segundo grau, na
// forma ax² + bx + c. O programa deverá pedir os valores de a, b e c e fazer as
// verificações, informando ao usuário nas seguintes situações:
// a. Se o usuário informar o valor de a igual a zero, a equação não é do segundo grau
// e o programa não deve fazer pedir os demais valores, sendo encerrado;
// b. Se o delta calculado for negativo, a equação não possui raízes reais. Neste caso,
// informe ao usuário e encerre o programa;
// c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real.
// Calcule essa raiz e imprima seu valor para o usuário;
// d. Se o delta for positivo, a equação possui duas raízes reais. Calcule-as e imprima
// seus valores para o usuário

import java.util.Scanner;

public class ExercicioS02E16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();

        System.out.print("\nDigite o valor de a: ");
            double a = sc.nextDouble();

        if (a == 0) {

            System.out.print("\nNão é uma equação de segundo grau");

        } else {
            
            System.out.print("Digite o valor de b: ");
            double b = sc.nextDouble();

            System.out.print("Digite o valor de c: ");
            double c = sc.nextDouble();

            double delta = b*b - 4*a*c;


            if (delta < 0) {

                System.out.print("O delta não possui raízes reais! Valor de delta: " + delta);

            } else if (delta == 0) {

                System.out.print("A equação possui apenas uma raiz real. Valor de delta: " + delta);

            } else {
                double raizQuadrada = Math.sqrt(Math.abs(delta));
                double x1 = (- b + raizQuadrada) / (2*a);
                double x2 = (- b - raizQuadrada) / (2*a);

                System.out.print("\nValor de delta: " + delta);
                System.out.printf("\nValor de x1: %.2f", x1);
                System.out.printf( "\nValor de x2: %.2f", x2);
                System.out.printf("\nA soma das duas raízes reais: %.2f", x1 + x2);
            }

            

        }
        
    }
}
