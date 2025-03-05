import java.util.Scanner;

public class ExercicioS05E23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.println("Digite o valor de y: ");
        int y = sc.nextInt();

        sc.close();

        // operador ternário: condicao ? valor1 : valor2
        System.out.println((x > y) ? 1 : 0);
        System.out.println((x == y) ? 1 : 0);
        System.out.println((x < y) ? 1 : 0);
        System.out.println((x != y) ? 1 : 0);
        System.out.println((x >= y) ? 1 : 0);
        System.out.println((x <= y) ? 1 : 0);
    }

}