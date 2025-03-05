import java.util.Scanner;

public class ExercicioS06E05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o valor de N: ");
        int n = sc.nextInt();

        sc.close();

        int fibonacci = 1; 
        int fibonacciAnterior = 0;
        int atualizarValores;


        for (int i = 1; i <= n; i++) {
            
            System.out.println(fibonacci);
            atualizarValores = fibonacci;
            fibonacci += fibonacciAnterior;
            fibonacciAnterior = atualizarValores;
        }
    }
}
