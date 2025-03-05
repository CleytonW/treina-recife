import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        double soma = numero1 + numero2;

        System.out.println("Resultado da soma: " + soma);
    }
}
