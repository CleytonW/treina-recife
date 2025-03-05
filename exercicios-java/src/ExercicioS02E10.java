
import java.util.Scanner;

public class ExercicioS02E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o seu turno: ");
        char turno = sc.nextLine().toUpperCase().charAt(0);

        sc.close();

        if (turno == 'M' || turno == 'm') {
            System.out.print("Bom dia!");
        } else if (turno == 'V') {
            System.out.print("Boa tarde!");
        } else if (turno == 'N') {
            System.out.print("Boa noite!");
        } else {
            System.out.print("Valor inválido.");
        }
    }
}
