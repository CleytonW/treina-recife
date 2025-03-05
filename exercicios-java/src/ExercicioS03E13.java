// Faça um programa que peça dois números: base e expoente. Em seguida, calcule e
// imprima o primeiro número elevado ao segundo número. Não utilize a função de
// potência da linguagem.

import java.util.Scanner;

public class ExercicioS03E13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a base: ");
        int base = sc.nextInt();
        
        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();    

        sc.close();

        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println(resultado);
    }
}
