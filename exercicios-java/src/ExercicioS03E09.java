// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.


public class ExercicioS03E09 {
    public static void main(String[] args) {

        // int numero = 1;
        // while (numero <= 50) {
        //    if (numero % 2 != 0) {
        //     System.out.println(numero);
        //    }
        //    numero++;
        // }
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) { // verificando se o número é ímpar
                System.out.print(i + ", ");
            }
        }

        int k = 1;

        while (k <= 50) {
            System.out.println(k);
            k += 2;
        }

    }

}
