import java.util.Scanner;

public class ExercicioAula1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número maior que 0: ");
        int x = sc.nextInt();

        sc.close();

        if (x <= 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número positivo");
        }
    }
}
