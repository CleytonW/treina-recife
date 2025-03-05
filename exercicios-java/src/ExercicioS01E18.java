/* Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo
que calcule seu peso ideal, utilizando as seguintes fórmulas:
a. Para homens: (72.7*h) - 58
b. Para mulheres: (62.1*h) - 44.7
*/

import java.util.Scanner;

public class ExercicioS01E18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                   
        System.out.print("\n Digite sua altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite seu sexo M/F: ");
        String masculinoFeminino = sc.nextLine().toUpperCase();

        // System.out.print("Qual seu sexo M/F? ");
        // String sexo = sc.next();

        sc.close();

         if (masculinoFeminino == "M") {
            double pesoMasculino = (62.1 * altura) - 44.7;
            System.out.printf("\nSeu peso ideal é: %.2f", pesoMasculino);
        } else {
            double pesoFeminino = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f", pesoFeminino);       
        }

        // double pesoMasculino = (62.1 * altura) - 44.7;
        // double pesoFeminino = (62.1 * altura) - 44.7;
        
        // System.out.printf("O peso ideal para o sexo masculino é: %.2f", pesoMasculino);
        // System.out.printf("O peso ideal para o sexo feminino é: %.2f", pesoFeminino);  

    }
}