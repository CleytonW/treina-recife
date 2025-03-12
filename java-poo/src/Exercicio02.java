import java.time.LocalDate;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Produto arroz = new Produto();

        arroz.setId(3);
        arroz.setNome("Arroz Branco");
        arroz.setDescricao("Pacote de 1kg");
        arroz.setValidade(LocalDate.of(2025, 2, 23));

        int qtdeDiasRestantes = arroz.calcularDiasRestante();

        if (qtdeDiasRestantes == 0) {
            System.out.println("O produto vence hoje!");
        } else if (qtdeDiasRestantes > 0) {
            System.out.printf("Faltam %d dias para o produto vencer.\n", qtdeDiasRestantes);
        } else {
            System.out.println("O produto já venceu! Jogue fora..");
        }
    }

}