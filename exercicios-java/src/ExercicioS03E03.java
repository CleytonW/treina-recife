import java.util.Scanner;

public class ExercicioS03E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o nome: ");
        String nome = sc.nextLine();

        while (nome.length() <= 3) {
            System.out.print("Digite um nome válido: ");
            nome = sc.nextLine();
        }

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        while (idade < 0 || idade > 150) {
            System.out.print("Valor inválido. Digite uma idade: ");
            idade = sc.nextInt();
        }

        sc.nextLine();

        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        while (salario <= 0) {
            System.out.print("Salário invalido. Digite o salário: ");
            salario = sc.nextDouble();
        }

        sc.nextLine();

        System.out.print("Informe o sexo: ");
        char sexo = sc.next().charAt(0);

        while (sexo != 'f' && sexo != 'm') {
            System.out.print("Sexo inválido. Informe o sexo: ");
            sexo = sc.next().charAt(0);
        }


        System.out.print("Informe o estado civil: ");
        char estadoCivil = sc.next().charAt(0);

        while (estadoCivil != 's' && estadoCivil != 'c' & estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.print("Estado civil inválido. Informe o estado civil: ");
            estadoCivil = sc.next().charAt(0);  
        }

        sc.close();










        sc.close();
 
    }
}
