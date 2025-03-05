
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioS04E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o %d° número: ", i+1);
            numeros[i] = sc.nextInt();
        }

        ArrayList<Integer> listaNumero = new ArrayList<>();

        System.out.println("Tamanho inicial da lista" + listaNumero.size());

        for (int i = 0; i < numeros.length; i++) {
            listaNumero.add(numeros[i]);
        }

        // for (int i = 0; i < listaNumero.size(); i++) {
        //     System.out.print(listaNumero.get(i) + " ");
        // }


        // for-each
        for (Integer elemento : listaNumero) {
            System.out.print(elemento + " ");
        }


        sc.close();
    }
}
