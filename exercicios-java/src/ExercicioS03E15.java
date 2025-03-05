// Implemente um programa em Java que solicite ao usuário a quantidade de notas
// que ele deseja informar. Em seguida, o programa deve receber cada uma das notas.
// Por fim, calcule e imprima a média dessas notas com duas casas decimais


import java.util.Scanner;

public class ExercicioS03E15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme a quantidade de nota(s): ");
        int qtdNota = sc.nextInt();

        double soma = 0;

        for (int i = 1; i <= qtdNota; i++) {
            System.out.print("Informe a " + i + "º nota: ");
            double nota = sc.nextDouble();
           
            soma += nota; //fazendo a soma e armazenando o valor
        }

        sc.close();

        double media = soma / qtdNota;

        System.out.printf("A média é: %.2f", media);

        
    }
}
