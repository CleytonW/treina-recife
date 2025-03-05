import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReservaIngressos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaComprasIngresso = new ArrayList<>();

        int ingressosComprados = 0;
        int totalIngressos = 10;

        
        System.out.print("Deseja comprar um ingressos? (s/n): ");
        String resposta = sc.next().toLowerCase();

        while (resposta.equals("s")) {
            
                if (totalIngressos == 0) {
                    System.out.print("Desculpe, não temos mais ingressos!\n");
                    System.out.println(listaComprasIngresso);
                } 

                System.out.print("Digite o nome do comprador: ");
                String nome = sc.next();

                // verificando se usuário ja comprou ingressos
                int ingressosUsuario = Collections.frequency(listaComprasIngresso, nome);
                if (ingressosUsuario + ingressosComprados > 2) {

                    System.out.printf("Limite de 2 ingressos por pessoa. Você já comprou %d.\n", ingressosUsuario);

                } else {

                    System.out.print("Quantos ingressos deseja comprar? ");
                    ingressosComprados = sc.nextInt();

                        if (ingressosComprados > 2) {
                            System.out.println("Limite de 2 ingressos por pessoa.");
                        }
                    
                    for(int i = 0; i < ingressosComprados; i++){
                        listaComprasIngresso.add(nome);
                        totalIngressos -= ingressosComprados;
                    }

                    System.out.println("Ingresso comprado com sucesso!");

                }  

            System.out.print("Deseja comprar um ingressos? (s/n): ");
            resposta = sc.next().toLowerCase();  
    
        }

        System.out.println("Obrigado. Até a próxima.");	   
        System.out.println(listaComprasIngresso);
        
        sc.close();
    }
}