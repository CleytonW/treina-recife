
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioS04E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] numero = new int[10];

        // for (int i = 0; i < numero.length; i++) {
        //     System.out.printf("Informe o %d° número: ", i+1);
        //     numero[i] = sc.nextInt();
        // }

        // for(int i = numero.length - 1; i >= 0; i--) {
        //     System.out.println(numero[i]);
        // }

        // sc.close();



        ArrayList <Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o %d° número: ", i+1);
            numeros.add(sc.nextInt());
        }

        for(int i = numeros.size() - 1; i >= 0; i--) {
            System.out.println(numeros.get(i));
        }

        sc.close();
    }
}
