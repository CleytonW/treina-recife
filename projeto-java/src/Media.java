
import java.util.Scanner;



public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite o segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite o terceira nota: ");
        double nota3 = sc.nextDouble();

        sc.close();


        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média do aluno é: %.2f", media);

        // System.out.printf("Notas: %.2f %.2f %.2f \n", nota1, nota2, nota3);
        // System.out.printf("Média final = %.2f \n", media);
        
    }
}
