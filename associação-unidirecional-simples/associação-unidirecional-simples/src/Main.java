// Crie uma classe Autor que tenha os atributos nome e nacionalidade. Depois, crie uma classe Livro que tenha os atributos titulo e anoPublicacao. Estabeleça uma relação unidirecional onde cada Livro tem um único Autor.

// 1. Implemente as classes com os atributos mencionados.
// 2. Adicione os métodos necessários para definir e obter o autor de um livro.
// 3. No método main, crie um autor e associe-o a um livro, imprimindo os detalhes.


import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws Exception {
        Autor autor1 = new Autor();

        autor1.setNome("Cleyton");
        autor1.setNacionalidade("Brasileira");

        Livro livro1 = new Livro("Java POO", LocalDate.of(2025, 03, 06));
        livro1.setAutor(autor1);
        Livro livro2 = new Livro("Java Spring", LocalDate.of(2025, 03, 06));
        livro2.setAutor(autor1);


        System.out.print("O autor " + autor1.getNome() + ", " + "de nacionalidade " + autor1.getNacionalidade() + ", escreveu: " + livro1.getTitulo() + " e " + livro2.getTitulo() + " nas respectivas datas " + livro1.getAnoPublicacao() + " e " + livro2.getAnoPublicacao());
    }
}
