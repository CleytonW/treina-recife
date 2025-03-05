// Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
// Depois modifique o programa para que ele mostre os números um ao lado do outro

public class ExercicioS03E06 {
    public static void main(String[] args) {

        int i = 1;

        while (i < 20) {
            i++;
            System.out.println(i);
       }

       for (i = 1; i <= 20; i++) {
        System.out.print(i + ", ");
       }

    //    while (i < 20) {
    //     i++;
    //     System.out.print(i + ", ");
    //    }

    }

}
