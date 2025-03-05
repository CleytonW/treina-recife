
import java.util.Scanner;

public class ExercicioS02E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = sc.nextInt();

        sc.close();

        if (numero1 > numero2) {
            System.out.printf("O maior número é %d", numero1);
        } else {
            System.out.printf("O maior número é %d", numero2);
        }
    }
}
