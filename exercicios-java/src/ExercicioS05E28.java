public class ExercicioS05E28 {

    public static void main(String[] args) {
        
        // int i = 1;
        // int j = 60;
        // while (j >= 0) {
        //     System.out.printf("I = %d J = %d", i, j);
        //     j -= 5;
        //     i += 3;
        // }

        int i = 1;
        for (int j = 60; j >= 0; j -= 5) {
            System.out.printf("I = %d J = %d\n", i, j);
            i += 3;
        }
    }
}