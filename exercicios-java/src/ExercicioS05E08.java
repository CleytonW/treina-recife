// Elabore um programa que permita calcular o Imposto de Renda (IR) de um casal a
// partir das rendas de cada cônjuge. O imposto é calculado sobre a renda conjunta de
// acordo com a tabela abaixo:
// Renda Conjunta Alíquota - IR
// Até 900.00 Isento
// De 900.01 até 1500.00 10%
// De 1500.01 até 2500.00 15%
// Acima de 2500.00 25%
// Entrada
// O arquivo de entrada contém valores com dupla precisão referente a renda de cada
// cônjuge.
// Saída
// Imprima a renda conjunta, a alíquota utilizada, o imposto de renda e a renda
// líquida calculada.



import java.util.Scanner;

public class ExercicioS05E08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme os valores: ");
        double valor1 = sc.nextDouble(); double valor2 = sc.nextDouble();
        
        sc.close();
        
        double rendaConjunta = valor1 + valor2;
        double aliquota;

      if (rendaConjunta <= 900) {
        aliquota = 0;
      } else if (rendaConjunta <= 1500) {
        aliquota = 10;
      } else if (rendaConjunta <= 2500) {
        aliquota = 15;
      } else {
        aliquota = 25;
      }

      double impostoRenda = aliquota * rendaConjunta;
      double rendaLiquida = rendaConjunta - impostoRenda;


      System.out.printf("\nRenda conjunta: %.2f", rendaConjunta);
      System.out.printf("\nAlíquota utilizada: %.0f%%", aliquota * 100);
      System.out.printf("\nImposto de renda: %.2f", impostoRenda);
      System.out.printf("\nRenda líquida: %.2f", rendaLiquida);
      
    }
}
