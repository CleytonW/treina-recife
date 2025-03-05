import java.util.Scanner;

public class ExercicioS06E02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N:");
        int n = sc.nextInt();

        sc.close();

        double soma = 0;
        double denominador = 1;

        // Solução 1
        for (int numerador = n; numerador >= 1; numerador--) {
            soma += numerador/denominador;
            denominador++;
        }

        // Solução 2
        // double numerador = n;
        // for (int denominador = 1; denominador <= n; denominador++) {
        //     soma += numerador/denominador;
        //     numerador--;
        // }

        System.out.println("SOMA = " + soma);
    }
}