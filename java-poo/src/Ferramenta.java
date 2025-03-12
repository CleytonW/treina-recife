
public class Ferramenta extends ItemDeLoja {

    private String categoria;
    private Integer serial;

    public Ferramenta() {

    }

    public Ferramenta(String categoria, Integer serial) {
        this.categoria = categoria;
        this.serial = serial;
    }

    public Ferramenta(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem, String categoria,
            Integer serial) {
        super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
        this.categoria = categoria;
        this.serial = serial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public void separar(String categoria) {
        if (categoria.equals(null)) {
           setCategoria("");
        } else {
            setCategoria(categoria);
        }
    }

    public String toString() {
        return String.format(categoria, separar());
    }

    @Override
    public int getIdentificador() {
        return serial;
    }

}
