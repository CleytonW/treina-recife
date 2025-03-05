import java.util.Scanner;

public class ExercicioS02E09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = sc.nextDouble();

        sc.close();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.printf("\nO maior número é o %.2f", numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.printf("\nO maior número é o %.2f", numero2);
        } else {
            System.out.printf("\nO maior número é o %.2f", numero3);
        }
    }
}
