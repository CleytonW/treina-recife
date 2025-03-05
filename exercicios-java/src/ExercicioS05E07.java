
import java.util.Scanner;

public class ExercicioS05E07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número:");
        int numero = sc.nextInt();
        
        sc.close();

        int notas100 = numero / 100;
        int resto100 = numero % 100;

        int notas50 = resto100 / 50;
        int resto50 = resto100 % 50;

        int notas20 = resto50 / 20;
        int resto20 = resto50 % 20;

        int notas10 = resto20 / 10;
        int resto10 = resto20 % 10;

        int notas5 = resto10 / 5;
        int resto5 = resto10 % 5;

        int notas2 = resto5 / 2;
        int resto2 = resto5 % 2;

        int notas1 = resto2;

        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00\n", notas1);
    }
}
