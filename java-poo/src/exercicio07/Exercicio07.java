package exercicio07;

public class Exercicio07 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setAnoModelo(2025);
        carro1.setAnoFabricacao(2025);
        carro1.setCor("Vermelho");

        Modelo modelo1 = new Modelo();

        modelo1.setMarca("Chevrolet");
        modelo1.setNome("Onix");

        Item item1 = new Item();

        item1.setCodigo(159);
        item1.setNome("Banco");
    }
}
