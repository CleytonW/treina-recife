public class ExercicioS06E07 {
    public static void main(String[] args) {

        int somaPar = 0;
        int somaImpar = 0;
        int resultado;


        for(int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                somaPar += i;
            } else {
                somaImpar += i;
            }
        }

        resultado = somaPar - somaImpar;
        double fatorial = 1;

        for (int i = 1; i <= resultado; i++) {
            fatorial *= i;
        }

        System.out.printf("RESULTADO: %.0f", fatorial);


    }
}
