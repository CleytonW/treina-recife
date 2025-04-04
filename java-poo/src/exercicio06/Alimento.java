package exercicio06;

public class Alimento extends ItemDeLoja {

    private Integer selo;

    public Alimento() {

    }

    public Alimento(Integer selo) {
        this.selo = selo;
    }

    public Alimento(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem, Integer selo) {
        super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
        this.selo = selo;
    }

    public Integer getSelo() {
        return selo;
    }

    public void setSelo(Integer selo) {
        this.selo = selo;
    }

    public int getIdentificador() {
        return selo;
    }
}
