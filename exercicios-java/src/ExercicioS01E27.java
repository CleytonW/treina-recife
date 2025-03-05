/* Elaborar um programa que efetue a apresentação do valor da conversão em real
(R$) de um valor lido em dólar (US$). O programa deverá solicitar o valor da
cotação do dólar e a quantidade de dólares disponíveis com o usuário */


import java.util.Scanner;

public class ExercicioS01E27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme a cotação do dolar atual: ");
        double cotacaoDolar = sc.nextDouble();

        System.out.print("Informa quanto o usuário tem de dolar: ");
        double dolarUsuario = sc.nextDouble();

        sc.close();

        double conversorDolarReal = cotacaoDolar * dolarUsuario;

        System.out.printf("O valor de US$%.2f é equivalente a R$%.2f ", dolarUsuario, conversorDolarReal);

    }
}
