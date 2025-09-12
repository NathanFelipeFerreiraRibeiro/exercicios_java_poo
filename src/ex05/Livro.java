package ex05;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        if (titulo == null) {
            throw new IllegalArgumentException("Título não pode ser nulo.");
        }

        if (autor == null) {
            throw new IllegalArgumentException("Autor não pode ser nulo.");
        }

        if (ano < 0) {
            throw new IllegalArgumentException("Ano não pode ser nulo e nem menor que zero.");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void descricao() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano: " + this.getAno());
    }
}
