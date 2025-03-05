public class ExercicioS05E35 {
    public static void main(String[] args) {
        
        double soma = 0;
        double denominador = 1;

        for (int numerador = 1; numerador <= 39; numerador =+ 2) {
            soma += numerador / denominador;
            denominador *= 2;
        }

        System.out.printf("Soma = ", soma);
    }
}
