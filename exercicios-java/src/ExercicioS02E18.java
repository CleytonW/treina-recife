import java.util.Scanner;

public class ExercicioS02E18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o dia: ");
        int dia = sc.nextInt();
            if (dia >= 1 && dia <= 31) {
                System.out.print("Informe o mês: ");
                int mes = sc.nextInt();
                    if (mes >= 1 && mes <= 12) {
                        System.out.print("Informe o ano: ");
                        int ano = sc.nextInt();
                            if (ano >= 1000 && ano <= 4000) {
                                System.out.printf("%d/%d/%d", dia, mes, ano);
                                
                            } else {
                                System.out.println("Formato inválido");
                            }
                    } else {
                        System.out.println("Formato inválido");
                    }
            } else {
                System.out.println("Formato inválido");
            }

        sc.close();
    }
}
