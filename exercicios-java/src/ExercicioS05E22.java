import java.util.Scanner;

public class ExercicioS05E22 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o consumo de água em m³:");
        int consumo = sc.nextInt();

        sc.close();

        if (consumo >= 0 && consumo <= 10) {
            System.out.println("Valor em Reais: 7.00");
        } else if (consumo >= 11 && consumo <= 30) {
            int valorSemFranquia = consumo - 10;
            int valorPagar = 7 + 1 * valorSemFranquia;
            System.out.println("Valor em Reais: " + valorPagar);
        } else if (consumo >= 31 && consumo <= 100) {
            int valorSemFranquia = consumo - 10;  
            int valorSemFaixa1 = valorSemFranquia - 20;
            int valorPagar = 7 + 20 * 1 + valorSemFaixa1 * 2;
            System.out.println("Valor em Reais: " + valorPagar);
        } else {
            int valorSemFranquia = consumo - 10;  
            int valorSemFaixa1 = valorSemFranquia - 20;
            int valorSemFaixa2 = valorSemFaixa1 - 70;
            int valorPagar = 7 + 20 * 1 + 70 * 2 + valorSemFaixa2 * 5;
            System.out.println("Valor em Reais: " + valorPagar);
        }
    }

}
