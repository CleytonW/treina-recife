
import java.util.Scanner;

public class ExercicioS02E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o número: ");
        int numero = sc.nextInt();

        sc.close();

        if (numero > 0) {
            System.out.print("Número positivo!");
        } else if (numero < 0) {
            System.out.print("Número negativo");
        } else {
            System.out.print("Número é o proprio zero");
        }

    }
}
