/* Faça um programa que lê o nome de um vendedor, o seu salário fixo e o total de
vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha
15% de comissão sobre suas vendas efetuadas, informar o total a receber no final
do mês, com duas casas decimais.
Entrada:
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de
dupla precisão com duas casas decimais, representando o salário fixo do vendedor
e o montante total das vendas efetuadas por este vendedor, respectivamente.
Saída:
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido */


// import java.util.Locale;
import java.util.Scanner;

public class ExercicioS05E03 {
    public static void main(String[] args) {
        // Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o nome do vendedor: ");
        String nome = sc.nextLine();

        System.out.printf("Informe o valor do salário fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Informe o total das vendas realizadas: ");
        double totalVendas = sc.nextDouble();

        sc.close();

        double comissao = (totalVendas / 100) * 15;
        double salarioTotal = (comissao + salarioFixo);

        System.out.printf("\n%s TOTAL = R$ %.2f", nome, salarioTotal);
    }
}
