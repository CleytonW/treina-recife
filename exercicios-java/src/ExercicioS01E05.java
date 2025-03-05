//Faça um programa que converta metros para centímetros (1m = 100cm).

import java.util.Scanner;

public class ExercicioS01E05 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    System.out.print("\n Informe a quantidade de metros: ");
    double metros = sc.nextDouble();

    sc.close();

    double centimetros = metros * 100;

    System.out.printf("A conversão de %.2fm para centimetros é: %.2fcm", metros, centimetros);
   } 
}
