import java.util.Scanner;

public class ExercicioS02E15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o primeiro lado: ");
        double lado1 = sc.nextDouble();

        System.out.print("\nDigite o segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.print("\nDigite o terceiro lado: ");
        double lado3 = sc.nextDouble();

        sc.close();


        if ((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 || (lado3 + lado1) > lado2) {
            System.out.println("É um triângulo!");
                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("Triâgulo Equilátero");
                } else if (lado1 == lado2 || lado2 == lado3) {
                    System.out.println("Triâgulo Isósceles");
                } else {
                    System.out.println("Triâgulo Escaleno");
                }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
