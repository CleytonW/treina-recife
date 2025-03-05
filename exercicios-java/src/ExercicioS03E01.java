
import java.util.Scanner;

public class ExercicioS03E01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("\nDigite a nota: ");
        int nota = sc.nextInt();


        while (nota < 0 || nota > 10) {
            System.out.print("Valor inválido! Informe um valor de 0 à 10: ");
            nota = sc.nextInt();
        }

        sc.close();

    }
}