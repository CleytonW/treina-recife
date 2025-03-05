import java.util.Scanner;

public class ExercicioS06E08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o valor de a: ");
        int a = sc.nextInt();

        if (a == 0) {

            System.out.print("\nNão é uma equação de segundo grau");

        } else {
            
            System.out.print("Digite o valor de b: ");
            double b = sc.nextDouble();

            System.out.print("Digite o valor de c: ");
            double c = sc.nextDouble();

            double delta = b*b - 4*a*c;


            if (delta < 0) {

                System.out.print("O delta não possui raízes reais! Valor de delta: " + delta);

            } else if (delta == 0) {

                System.out.print("A equação possui apenas uma raiz real. Valor de delta: " + delta);

            } else {
                double raizQuadrada = Math.sqrt(Math.abs(delta));
                double x1 = (- b + raizQuadrada) / (2*a);
                double x2 = (- b - raizQuadrada) / (2*a);

                System.out.printf("\nValor de x1: %.2f", x1);
                System.out.printf( "\nValor de x2: %.2f", x2);
            }

        }

        sc.close();
    }
}
