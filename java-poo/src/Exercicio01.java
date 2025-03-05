public class Exercicio01 {
    public static void main(String[] args) {

        //Intância de objetos da classe transporte
        Transporte caminhao = new Transporte();


        caminhao.setId(1);
        caminhao.setAno(1995);
        caminhao.setModelo("Fiat");
        caminhao.setCargaMaxima(2000.00);
        caminhao.setPotencia(45.00);


        System.out.println("Consumo: " + caminhao.calcularConsumo());
    }
}
