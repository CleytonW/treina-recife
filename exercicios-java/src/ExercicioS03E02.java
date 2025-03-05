import java.util.Scanner;

public class ExercicioS03E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do usuário: ");
        String nome = sc.nextLine().toLowerCase();
        sc.nextLine();

        System.out.print("Informe a senha do suário: ");
        String senha = sc.nextLine().toLowerCase();
        sc.nextLine();


        while (nome.equals(senha) || nome.length() < 6 || senha.contains(nome)) {
            System.out.println("");
            senha = sc.nextLine().toLowerCase();

        }

        sc.close();
    }
}
