/* Faça um programa que peça o tamanho de um arquivo para download (em MB) e a
velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado
de download do arquivo usando este link (em minutos) */


import java.util.Scanner;

public class ExercicioS01E23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo em MB: ");
        double arquivoDownload = sc.nextDouble();

        System.out.print("Informe sua velocidade de internet em Mbps: ");
        double velocidadeMbps = sc.nextDouble();

        sc.close();

        double tempoDownload = (arquivoDownload * 8) / velocidadeMbps;
        double conversorMinutos = tempoDownload / 60;

        System.out.printf("O tempo apróximado para download é de %.2f minutos", conversorMinutos);

    }
}
