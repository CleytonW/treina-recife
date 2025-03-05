public class Poo {
    public static void main(String[] args) throws Exception {

        Usuario usuario1 = new Usuario();

        usuario1.setNome("Cleyton Mello");
        usuario1.setEmail("cleytonw11@gmail.com");
        usuario1.setIdade(29);
        usuario1.setPeso(68);
        usuario1.setAltura(1.69);
        usuario1.setEhPcd(false);
        usuario1.setGenero('M');

        // usuario1.exibirDetalhes();

        System.out.println(usuario1.getNome());
        System.out.println(usuario1.getEmail());
        System.out.println(usuario1.getIdade());
        System.out.println(usuario1.getPeso());
        System.out.println(usuario1.getAltura());
        System.out.println(usuario1.getEhPcd());
        System.out.println(usuario1.getGenero());



    }   
}
