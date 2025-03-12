public class MeioDeTransporte {

    private Integer id;
    private Integer ano;
    private String modelo;
    private double cargaMaxima;
    private double potencia;

    public MeioDeTransporte() {

    }

    public MeioDeTransporte(Integer id, Integer ano, String modelo, double cargaMaxima) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
    }

    public MeioDeTransporte(Integer id, Integer ano, String modelo, Double cargaMaxima, Double potencia) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.potencia = potencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double consumo() {
        return potencia * cargaMaxima * 100;
    }
}