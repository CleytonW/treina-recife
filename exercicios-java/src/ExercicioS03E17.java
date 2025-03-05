// Altere o programa anterior, permitindo ao usuário calcular o fatorial várias vezes e
// limitando o fatorial a números inteiros positivos e menores que 16.

import java.util.Scanner;

public class ExercicioS03E17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o valor: ");
        int n = sc.nextInt();

        int fatorial = 1;
        
        while (n < 0 || n > 16) {
        
            System.out.print("\nInforme um valor inteiro, positivo e abaixo de 16!\n Informe o valor: ");
            n = sc.nextInt();

        } 
    
        for (int i = n; i >= 1; i--) {
            fatorial *= i;
        }   


        sc.close();
    
        System.out.print("O valor do fatoria de " + n + " é: " + fatorial);

    }

}

