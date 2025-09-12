package ex02;

public class Pessoas {
    private String nome;
    private int idade;

    public Pessoas(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, sou " + this.getNome() + " e tenho " + this.getIdade() + " anos.");
    }
}