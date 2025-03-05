import java.util.Scanner;

public class ExercicioS04E02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            numeros[i] = sc.nextInt();
        }

        sc.close();

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        
        double media = soma / 5.0;

        System.out.println("SOMA = " + soma);
        System.out.println("MÉDIA = " + media);
    }

}