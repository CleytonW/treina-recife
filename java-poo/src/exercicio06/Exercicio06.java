package exercicio06;

public class Exercicio06 {
    public static void main(String[] args) {
        ItemDeLoja item1 = new ItemDeLoja();

        item1.setCodigoDoItem(123);
        item1.setDescricaoDoItem("Primeiro item da loja");
        item1.setNomeDoItem("Caneta");
        item1.setValorDoItem(1.99);

        System.out.println("Item adicionado a loja: " + item1.getNomeDoItem() + "\nCódigo do item adicionado é: "
                + item1.getIdentificador());

        Ferramenta ferramenta1 = new Ferramenta(456, "Martelo", "Ferramenta utilizadar para martelar", 10.99, null,
                555);

        System.out.println("A ferramenta adicionada é: " + ferramenta1.getNomeDoItem() + "\nO serial: "
                + ferramenta1.getIdentificador() + "\nCategoria: " + ferramenta1.separar());

        Alimento alimento1 = new Alimento(789, "Banana", "Fruta amarela", 4.99, 777);

        System.out.println(
                "Alimento adicionado: " + alimento1.getNomeDoItem() + "\nSelo: " + alimento1.getIdentificador());
    }
}
