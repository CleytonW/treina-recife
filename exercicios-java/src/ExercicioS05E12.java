// Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível
// segundo o esquema abaixo, da esquerda para a direita. Em seguida conclua qual
// dos animais seguintes foi escolhido, através das três palavras fornecidas.

// Entrada
// A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o
// animal segundo a figura acima, com todas as letras minúsculas.
// Saída
// Imprima o nome do animal correspondente à entrada fornecida.

import java.util.Scanner;

public class ExercicioS05E12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme a primeira palavra: ");
        String palavra1 = sc.nextLine().toLowerCase();

        System.out.print("Informe a segunda palavra: ");
        String palavra2 = sc.nextLine().toLowerCase();

        System.out.print("Informe a terceira palavra: ");
        String palavra3 = sc.nextLine().toLowerCase();

        sc.close();

        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("ave")) {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.print("águia");
                } else {
                    System.out.print("pomba");
                }
            } else {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.print("homem");
                } else {
                    System.out.print("vaca");
                }
            }  
        } else {
                if (palavra2.equalsIgnoreCase("inseto")) {
                    if (palavra3.equalsIgnoreCase("hematofago")) {
                        System.out.print("pulga");
                    } else {
                        System.out.print("lagarta");
                    }
                } else {
                    if (palavra3.equalsIgnoreCase("hematofago")) {
                        System.out.print("sanguesuga");
                } else {
                    System.out.print("minhoca");
                }  
            } 
       
        }
        
    }
    
}
