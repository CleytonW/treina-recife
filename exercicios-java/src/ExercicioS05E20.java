import java.util.Scanner;

public class ExercicioS05E20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do bairro (S/I/T):");
        char codigoBairro = sc.nextLine().toUpperCase().charAt(0);

        // !(codigoBairro == 'S' || codigoBairro == 'I' || codigoBairro == 'T')
        if (codigoBairro != 'S' && codigoBairro != 'I' && codigoBairro != 'T') {
            System.out.println("Bairro inválido");
            sc.close();
            // encerrar a execução
            return;
        }

        System.out.println("Digite a renda do usuário em R$: ");
        double renda = sc.nextDouble();

        System.out.println("Digite o consumo de energia em R$: ");
        double consumo = sc.nextDouble();

        sc.close();

        int desconto = 0;

        switch (codigoBairro) {
            case 'S':
            // case 's':    
                if (renda >= 50 && renda <= 500) {
                    desconto = 50;
                } else if (renda > 500 && renda <= 1000) {
                    desconto = 25;
                }
                break;
            case 'I':
                if (renda >= 240 && renda <= 1000) {
                    desconto = 240;
                } else if (renda > 1000 && renda <= 5000) {
                    desconto = 120;
                }
                break;
            case 'T':
                if (renda >= 5000 && renda <= 10000) {
                    desconto = 720;
                } else if (renda > 10000 && renda <= 20000) {
                    desconto = 360;
                }
                break;
            default:
                System.out.println("Bairro inválido.");
                return;
        }

        double valorPagar = consumo - desconto;

        System.out.println("Valor a pagar: R$" + valorPagar);
    }
}
