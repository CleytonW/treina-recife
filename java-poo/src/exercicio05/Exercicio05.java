package exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
        Terrestre carro = new Terrestre();
        
        carro.setAno(2024);
        carro.setCargaMaxima(200);
        carro.setPotencia(10);

        System.out.println("Consumo = " + carro.consumo());

    }
}
