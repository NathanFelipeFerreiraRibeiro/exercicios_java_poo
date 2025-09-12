package ex05;

public class instanciarLivro {
    public static void main(String[] args) {
        String titulo = "Dom Casmurro";
        String autor = "Machado de Assis";
        int ano = 1899;

        Livro l1 = new Livro(titulo, autor, ano);
        l1.descricao();
    }
}
