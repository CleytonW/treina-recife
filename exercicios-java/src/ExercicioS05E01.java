
import java.util.Scanner;

public class ExercicioS05E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Digite o valor da primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("\n Digite o valor da segunda nota: ");
        double nota2 = sc.nextDouble();

        sc.close();

        
        double media = (nota1 * 3.5) + (nota2 * 7.5) / 11;


        System.out.printf("A média é: %.5f", media);
    }
}
