import java.util.ArrayList;
import java.util.Scanner;

public class CheckIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        System.out.print("Deseja fazer o check-in? (sim/sair): ");
        String responta = sc.next().toLowerCase();

        while (responta.equals("sim")) {
            System.out.print("Informe o nome do participante: ");
            String nome = sc.next().toLowerCase();

            if (nomes.contains(nome)) {
                System.out.println("Participante já realizou o check-in!");
            } else {
                nomes.add(nome);
            }

            System.out.print("Deseja fazer o check-in? (sim/sair): ");
            responta = sc.next().toLowerCase();

        }

        sc.close();

        System.out.print("Obrigado. Bom evento! ");
        System.out.print(nomes);

    }
}
