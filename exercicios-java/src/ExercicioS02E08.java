import java.util.Scanner;

public class ExercicioS02E08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double menorPreco;

        System.out.print("Digite o preço do produto n.1: ");
        double precoP1 = sc.nextDouble();

        menorPreco = precoP1;

        System.out.print("Digite o preço do produto n.2: ");
        double precoP2 = sc.nextDouble();

        if (precoP2 < menorPreco) {
            menorPreco = precoP2;
        }

        System.out.print("Digite o preço do produto n.3: ");
        double precoP3 = sc.nextDouble();

        if (precoP3 < menorPreco) {
            menorPreco = precoP3;
        }

        sc.close();

        System.out.print("O menor preço é: R$" + menorPreco);
    }
}
