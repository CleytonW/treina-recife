package exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
        MeioDeTransporte caminhao = new MeioDeTransporte(1, 2024, "FIAT", 200.00);

        // caminhao.setId(1);
        // caminhao.setAno(2024);
        // caminhao.setCargaMaxima(200.0);
        caminhao.setModelo("Modelo Qualquer");
        caminhao.setPotencia(45.0);

        System.out.println("Consumo = " + caminhao.consumo());

        MeioDeTransporte carreta = new MeioDeTransporte(2, 2025, "TOP", 230.0, 10.0);

        System.out.println("Consumo = " + carreta.consumo());
    }
}
