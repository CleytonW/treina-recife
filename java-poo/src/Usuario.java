public class Usuario {
    
    // atributos (características)
    private String nome;
    private String email;
    private int idade;
    private double peso;
    private double altura;
    private boolean ehPcd;
    private char genero;


    //métodos
    //nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    //e-mail
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    //idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    //peso
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }

    //altura
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    //PCD
    public void setEhPcd(boolean ehPcd) {
        this.ehPcd = ehPcd;
    }
    public boolean getEhPcd() {
        return ehPcd;
    } 

    //gênero
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public char getGenero() {
        return genero;
    } 



    // public void exibirDetalhes() {

    //     System.out.println("------------------");
    //     System.out.println("Nome: " + nome);
    //     System.out.println("E-mail: " + email);
    //     System.out.println("Peso : " + peso);
    //     System.out.println("Altura: " + altura);
    //     System.out.println("Gênero: " + genero);
    //     System.out.println("PCD: " + ehPcd);
    //     System.out.println("Idade: " + idade);

    // }

}
