// Faça um programa que leia as duas notas parciais obtidas por um aluno numa
// disciplina ao longo de um semestre, e calcule a sua média.
// A atribuição de conceitos obedece à tabela abaixo:
// Média de Aproveitamento Conceito
// Entre 9.0 e 10.0 = A
// Entre 7.5 e 9.0 = B
// Entre 6.0 e 7.5 = C
// Entre 4.0 e 6.0 = D
// Entre 4.0 e zero = E
// O algoritmo deve imprimir na tela as notas, a média, o conceito correspondente e a
// mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito
// for D ou E.

import java.util.Scanner;

public class ExercicioS02E14 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("\nInforme a primeira nota: ");
       double nota1 = sc.nextDouble();

       System.out.print("Informe a segunda nota: ");
       double nota2 = sc.nextDouble();

       sc.close();

       double media = (nota1 + nota2) / 2;
       char conceitoAproveitamento = 0;

       if (media >= 9.0 && media <= 10.0) {
            conceitoAproveitamento = 'A';
            System.out.printf("\nMédia: %.1f", media);        
        } else if (media >= 7.5 && media < 9 ) {
            conceitoAproveitamento = 'B';
            System.out.printf("\nMédia: %.1f", media);
        } else if (media >= 6.0 && media < 7.5) {
            conceitoAproveitamento = 'C';
            System.out.printf("\nMédia: %.1f", media);
        } else if(media >= 4.0 && media < 6.0) {
            conceitoAproveitamento = 'D';
            System.out.printf("\nMédia: %.1f", media);
        } else if (media < 4.0 && media >= 0) {
            conceitoAproveitamento = 'E';
            System.out.printf("\nMédia: %.1f", media);
        } else {
            System.out.printf("\nNotas inválidas!");
        }

        System.out.printf("\nPrimeira nota: %.1f", nota1);
        System.out.printf("\nSegunda nota: %.1f", nota2);
        

        switch (conceitoAproveitamento) {
            case 'A':
            case 'B':
            case 'C':
                System.out.printf("\nAluno aprovado. PARABÉNS!");
                break;
            case 'D':
            case 'E':
                System.out.printf("\nAluno reprovado!");
                break;
        }
    }
}
