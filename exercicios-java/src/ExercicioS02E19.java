// Faça um programa que leia um número inteiro menor que 1000 e imprima a
// quantidade de centenas, dezenas e unidades do mesmo. Observando os termos no
// plural a colocação do "e", da vírgula entre outros. Exemplo:
// ● 326 = 3 centenas, 2 dezenas e 6 unidades
// ● 12 = 1 dezena e 2 unidades
// Testar com: 326, 300, 100, 320, 310, 305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16.

import java.util.Scanner;

public class ExercicioS02E19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nDigite um número inteiro menor que 1000: ");
    int numero = sc.nextInt();

        while (numero < 0 || numero >= 1000) {
        System.out.print("Valor inválido. \nDigite um número inteiro menor que 1000: ");
        numero = sc.nextInt();
        } 
        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = (numero % 100) % 10;

        String resultado = "";

        if (centenas > 0) {
            resultado = resultado + centenas + " " + (centenas == 1 ? "centena" : "centenas");

            if (dezenas > 0 || unidades > 0) {
                resultado = resultado + (dezenas > 0 && unidades > 0 ? ", " : " e ");
            }
        } 

        if (dezenas > 0) {
            resultado = resultado + dezenas + " " + (dezenas == 1 ? "dezena" : "dezenas");

            if (unidades > 0) {
                resultado = resultado + " e ";
            }
        }

        if (unidades > 0) {
            resultado = resultado + unidades + " " + (unidades == 1 ? "unidade" : "unidades");
        }
        
        System.out.println(numero + " = " + resultado);
        sc.close();
    }

}

