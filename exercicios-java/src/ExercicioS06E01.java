public class ExercicioS06E01 {
    public static void main(String[] args) {
        
        double soma = 0;
        double qtd = 1;

        for (int i = 1; i <= 64; i++) {
            System.out.printf("Casa: %d - Quantidade: %.0f - Soma: %.0f\n", i, qtd, soma);
            qtd *= 2;
            soma += qtd; 
        }
    }
}
