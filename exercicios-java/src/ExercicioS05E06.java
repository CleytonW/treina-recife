/* Calcule o consumo médio de um automóvel sendo fornecidos a distância total
percorrida (em km) e o total de combustível gasto (em litros).
Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a
distância total percorrida (em km) e um valor real Y representando o total de
combustível gasto, com um dígito após o ponto decimal.
Saída
Apresente o valor que representa o consumo médio do automóvel com duas casas
decimais, seguido da mensagem "km/l" */

// import java.util.Locale;
import java.util.Scanner;

public class ExercicioS05E06 {
    public static void main(String[] args) {
        // Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme a distância percorida (KM): ");
        int km = sc.nextInt();

        System.out.print("Informe o combustível gasto: ");
        double gastoCombustivel = sc.nextDouble();

        sc.close();

        double consumoMedio = km / gastoCombustivel;
        
        System.out.printf("\nO valor da média do consumo é %.2f km/l", consumoMedio);

    }
}
