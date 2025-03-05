import java.util.Scanner;

public class ExercicioS02E17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o ano: ");
        int ano = sc.nextInt();

        sc.close();

        int anoBissexto = ano % 4;

       System.out.println((anoBissexto == 0) ? "Bissexto" : "Não é bissexto");
    }
}
